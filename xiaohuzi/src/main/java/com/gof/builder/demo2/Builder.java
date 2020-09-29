package com.gof.builder.demo2;

// 抽象的建造者
public abstract class Builder {

    abstract Builder builderA(String A);  //汉堡
    abstract Builder builderB(String B);  //薯条
    abstract Builder builderC(String C);  //可乐
    abstract Builder builderD(String D);   //鸡翅

    //制作完成 拿到产品

    abstract Product getProduct();
}
