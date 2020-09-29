package com.gof.builder.demo1;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product builder = director.builder(new Worker());
        System.out.println(builder.toString());
    }
}
