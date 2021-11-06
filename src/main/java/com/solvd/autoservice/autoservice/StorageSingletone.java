package com.solvd.autoservice.autoservice;

public class StorageSingletone {

    private static StorageSingletone instance = null;

    private StorageSingletone(){
    }

    public static StorageSingletone getInstance(){
        if( instance==null){
            instance = new StorageSingletone();
        }
        return instance;
    }
    
}

