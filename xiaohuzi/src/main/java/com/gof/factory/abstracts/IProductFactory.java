package com.gof.factory.abstracts;
//抽象产品工厂
public interface IProductFactory {
    //生产手机
    IPhoneProduct iphone();

    //生产路由器

    IRoutProduct iRoute();


}
