package com.solvd.autoservice;

public class ThreadClass extends Thread{

    private final ConnectionPool connectionPool;
    public ThreadClass(ConnectionPool connectionPool) {
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
