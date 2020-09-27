package com.gof.factory.abstracts;

public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphone() {
        return new XiaoMIIphone();
    }

    @Override
    public IRoutProduct iRoute() {
        return new XiaoMiRoute();
    }
}
