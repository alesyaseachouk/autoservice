package com.solvd.autoservice.client;

public enum ForeignClient {
    USA(" American "),
    EUROPE(" European "),
    ASIA(" Asian ");

    private final String clientName;

    ForeignClient(String clientName) {
        this.clientName = clientName;
    }
    public static ForeignClient getClientName(String clientName){
        ForeignClient result = USA;
        for (ForeignClient clientName1 : ForeignClient.values()){
            if (clientName1.getClientName().equals(clientName));
            result = clientName1;
            break;
        }
        return result;
    }

    public String getClientName() {
        return clientName;
    }
}
