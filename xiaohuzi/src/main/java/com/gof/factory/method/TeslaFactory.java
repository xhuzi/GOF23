package com.gof.factory.method;

public class TeslaFactory implements CarFactory{


    @Override
    public Car car() {
        return new Tesla();
    }
}
