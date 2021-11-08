package com.solvd.autoservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.function.Function;

public class Delivery {

    private static final Logger LOGGER = LogManager.getLogger(Delivery.class);

    public void doingDelivery(Runnable runnable){
        LOGGER.info(" take order ");

        runnable.run();

        LOGGER.info(" go to client");
    }

    public void doingDeliveryIn(Function<String, Integer> inProgress){
        LOGGER.info(" take order ");

        int length = inProgress.apply(" Approved ");

        LOGGER.info(" Length " + length);
    }
}
