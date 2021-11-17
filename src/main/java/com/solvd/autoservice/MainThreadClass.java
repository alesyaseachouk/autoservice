package com.solvd.autoservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MainThreadClass {

    public static void main(String[] args) {
        IntStream.range(0, 100)
                .boxed()
                .forEach(index -> {
                    ConnectionPool connectionPool = ConnectionPool.getInstance(5);
                    Thread thread = new ThreadClass(connectionPool);
                    thread.start();
                });
        IntStream.range(0, 100)
                .boxed()
                .forEach(index -> {
                    ConnectionPool connectionPool = ConnectionPool.getInstance(5);
                    ImplRunnableClass runnable = new ImplRunnableClass(connectionPool);
                    Thread thread = new Thread(runnable);
                    thread.start();
                });
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorClass.start(executorService);
        IntStream.range(0, 100)
                .boxed()
                .forEach(index -> CompletableClass.start(executorService));
    }
}
