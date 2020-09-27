package com.gof.factory.simple;

public class Consumer {

    public static void main(String[] args) {
        Car  car = new Tesla();
        Car car1 = new WuLing();

        car.name();
        car1.name();

        CarFactory.getCar("五菱宏光").name();
        CarFactory.getCar("特斯拉").name();
        CarFactory.getDaZhong().name();
    }
}
