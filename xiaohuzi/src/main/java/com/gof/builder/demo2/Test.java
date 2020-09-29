package com.gof.builder.demo2;

public class Test {


    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.builderA("全家桶").getProduct();
        System.out.println(product);
    }
}
