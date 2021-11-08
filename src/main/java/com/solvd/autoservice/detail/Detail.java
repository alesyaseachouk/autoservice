package com.solvd.autoservice.detail;

public abstract class Detail {

    private String detailName;
    private int  detailCost;
    private boolean onStorage;

    public Detail(String detailName, int detailCost, boolean onStorage) {
        this.detailName = detailName;
        this.detailCost = detailCost;
        this.onStorage = onStorage;
    }

    public Detail(String detailName){
        this.detailName = detailName;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public int getDetailCost() {
        return detailCost;
    }

    public void setDetailCost(int detailCost) {
        this.detailCost = detailCost;
    }

    public boolean isOnStorage() {
        return onStorage;
    }

    public void setOnStorage(boolean onStorage) {
        this.onStorage = onStorage;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detailName='" + detailName + '\'' +
                '}';
    }
}
