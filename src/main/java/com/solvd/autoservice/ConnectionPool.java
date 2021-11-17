package com.solvd.autoservice;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ConnectionPool extends Thread{

    private static ConnectionPool instance;
    public static volatile ArrayList<Connection> connectionList;

    private ConnectionPool(Integer maxPoolSize) {
        connectionList = new ArrayList<>();
        IntStream.range(0, maxPoolSize)
                .boxed()
                .forEach(index -> connectionList.add(new Connection()));
    }

    @Override
    public void run() {
    }

    public static ConnectionPool getInstance(Integer maxPoolSize){
        if (instance==null) {
            instance = new ConnectionPool(maxPoolSize);
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        return connectionList.remove(0);
    }

    public synchronized void releaseConnection(Connection connection) {
        connectionList.add(connection);
    }
}

