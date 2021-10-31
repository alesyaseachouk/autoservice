package com.solvd.autoservice.cars;

public enum Brand {
    MERCEDES(" Mercedes "),
    AUDI(" Audi "),
    BMW(" BMW ");

    private final String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public static Brand showBrandName(String brandName){
        Brand result = null;
        for (Brand brandName1 : Brand.values()){
            if (brandName1.getBrandName().equals(brandName)){
                result = brandName1;
                break;
            }
        }
        return result;
    }

    public String getBrandName() {
        return brandName;
    }
}
