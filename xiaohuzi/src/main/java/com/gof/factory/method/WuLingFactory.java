package com.gof.factory.method;

public class WuLingFactory implements CarFactory {


    @Override
    public Car car() {
        return new WuLing();
    }
}
