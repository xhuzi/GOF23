package com.gof.builder.demo1;

public class Worker extends Builder {

    private Product product;

    public Worker( ) {
        product = new Product();
    }

    @Override
    void builderA() {
       product.setBuilderA("地基");
        System.out.println("地基");
    }

    @Override
    void builderB() {
        product.setBuilderB("钢筋");
        System.out.println("钢筋");
    }

    @Override
    void builderC() {
        product.setBuilderB("普电线");
        System.out.println("普电线");
    }

    @Override
    void builderD() {
        product.setBuilderB("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return new Product();
    }
}
