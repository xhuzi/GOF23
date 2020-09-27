package com.gof.factory.abstracts;

public class ClientTest {

    public static void main(String[] args) {
        System.out.println("*************华为产品************");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.iphone().cullUp();
        huaWeiFactory.iphone().sendSMS();
        huaWeiFactory.iphone().shutdown();


        System.out.println("*************小米产品************");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.iphone().shutdown();
        xiaoMiFactory.iphone().sendSMS();
        xiaoMiFactory.iphone().start();

    }
}
