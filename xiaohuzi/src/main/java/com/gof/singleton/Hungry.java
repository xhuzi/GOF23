package com.gof.singleton;

//饿汉单例模式
public class Hungry {

    /**
     * 饿汉单例模式，一上来就会直接创建对象，占用空间，造成内存的浪费
     */
    private byte[] bytes1 = new byte[1024*1024];
    private byte[] bytes2 = new byte[1024*1024];
    private byte[] bytes3 = new byte[1024*1024];

    //私有化构造器，保证只有一个对象
    private Hungry(){

    }

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
