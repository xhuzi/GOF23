package com.gof.builder.demo1;

//指挥， 核心 ，负责如何构造一个工程，由他决定
public class Director {

    public Product builder(Builder builder){
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
