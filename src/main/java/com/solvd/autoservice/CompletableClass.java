package com.solvd.autoservice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class CompletableClass {
    public static void start(ExecutorService executorService) {
        Connection connection = new Connection();

        CompletableFuture.allOf(
                (CompletableFuture
                        .runAsync(() -> {
                            connection.create();
                        }, executorService)
                        .thenRunAsync(() -> {
                            connection.delete();
                        }, executorService))
                ,
                CompletableFuture
                        .runAsync(() -> {
                            connection.read();
                            connection.update();
                        }, executorService));
    }
}
