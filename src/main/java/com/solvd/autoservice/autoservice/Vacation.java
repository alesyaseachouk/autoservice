package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.employee.StorageWorker;

import java.util.List;

public class Vacation<V extends StorageWorker>{

    private List<V> storageWorkers;

    public List<V> getStorageWorkers() {
        return storageWorkers;
    }

    public void setStorageWorkers(List<V> storageWorkers) {
        this.storageWorkers = storageWorkers;
    }
}
