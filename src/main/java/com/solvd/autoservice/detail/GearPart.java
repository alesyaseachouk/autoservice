package com.solvd.autoservice.detail;

import com.solvd.autoservice.interfaces.Washable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GearPart extends Detail implements Washable {

    private static final Logger LOGGER = LogManager.getLogger(GearPart.class);

    public GearPart(String detailName, int detailCost, boolean onStorage) {
        super(detailName, detailCost, onStorage);
    }

    @Override
    public void takeWashingThings(String detailName) {
        LOGGER.info(" Take washing things " + detailName);
    }

    @Override
    public void applySpecialAgent(String carBrand) {
        LOGGER.info(" Apply the agent " + carBrand);
    }

    @Override
    public void washWater(String carBrand) {
        LOGGER.info(" Wash by the water " + carBrand);
    }
}
