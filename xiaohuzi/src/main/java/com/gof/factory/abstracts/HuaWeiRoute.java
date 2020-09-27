package com.gof.factory.abstracts;

public class HuaWeiRoute implements IRoutProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置密码");
    }
}
