package com.solvd.autoservice.price;

import com.solvd.autoservice.detail.Detail;

import java.util.Arrays;

public class Invoice extends Price {

    public Invoice(Detail[] details) {
        super(Arrays.asList(details));
    }
}
