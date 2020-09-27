package com.gof.factory.method;

public class Consumer {

    public static void main(String[] args) {

        WuLingFactory wuLingFactory = new WuLingFactory();
        wuLingFactory.car().name();

        TeslaFactory teslaFactory = new TeslaFactory();
        teslaFactory.car().name();

        MoBaiFactory moBaiFactory = new MoBaiFactory();
        moBaiFactory.car().name();
    }
}
