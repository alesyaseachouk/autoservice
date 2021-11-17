package com.solvd.autoservice;

public class ImplRunnableClass implements Runnable {

    private final ConnectionPool connectionPool;
    public ImplRunnableClass(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
    @Override
    public synchronized void run() {
        Connection connection = (Connection) connectionPool.getConnection();
        connection.create();
        connection.read();
        connection.update();
        connection.delete();
        connectionPool.releaseConnection(connection);
    }

}
