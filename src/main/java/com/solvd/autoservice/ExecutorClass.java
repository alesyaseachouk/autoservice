package com.solvd.autoservice;

import java.util.concurrent.ExecutorService;
import java.util.stream.IntStream;

public class ExecutorClass {

    public static void start(ExecutorService executorService) {
        IntStream.range(0, 100)
                .boxed()
                .forEach(index -> executorService.submit(() -> {
                    Connection connection = new Connection();
                    connection.create();
                    connection.read();
                    connection.update();
                    connection.delete();
                }));
    }
}