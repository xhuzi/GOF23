package com.gof.factory.abstracts;

public class HuaWeiIphone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开机华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关机华为手机");
    }

    @Override
    public void cullUp() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
