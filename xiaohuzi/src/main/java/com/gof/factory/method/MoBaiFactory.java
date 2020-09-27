package com.gof.factory.method;

public class MoBaiFactory implements CarFactory {
    @Override
    public Car car() {
        return new MoBai();
    }
}
