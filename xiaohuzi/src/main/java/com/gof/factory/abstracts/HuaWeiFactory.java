package com.gof.factory.abstracts;

public class HuaWeiFactory implements  IProductFactory{


    @Override
    public IPhoneProduct iphone() {
        return new HuaWeiIphone();
    }

    @Override
    public IRoutProduct iRoute() {
        return new HuaWeiRoute();
    }
}
