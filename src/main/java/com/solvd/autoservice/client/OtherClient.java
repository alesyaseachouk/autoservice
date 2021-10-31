package com.solvd.autoservice.client;

public class OtherClient {

    private ForeignClient foreignClient;

    public enum ForeignClient {
        USA, EUROPE, ASIA
    }

    public ForeignClient getForeignClient() {
        return foreignClient;
    }

    public void setForeignClient(ForeignClient foreignClient) {
        this.foreignClient = foreignClient;
    }
}
