package com.gof.builder.demo2;

//生产产品的人
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String A) {
        product.setA(A);
        System.out.println(A);
        return this;
    }

    @Override
    Builder builderB(String B) {
        product.setA(B);
        System.out.println(B);
        return this;
    }

    @Override
    Builder builderC(String C) {
        product.setA(C);
        System.out.println(C);
        return this;
    }

    @Override
    Builder builderD(String D) {
        product.setA(D);
        System.out.println(D);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
