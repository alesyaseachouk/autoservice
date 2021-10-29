package com.solvd.autoservice;

import com.solvd.autoservice.interfaces.Washable;

public class WashService {

    public void washSmth(Washable smthCanbeWashed) {
        smthCanbeWashed.takeWashingThings("BMW");
        //.....
        smthCanbeWashed.washWater(" BMW ");
        smthCanbeWashed.washWater("");
    }
}
