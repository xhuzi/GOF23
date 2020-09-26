package com.gof.singleton;


import javax.sound.midi.Soundbank;

//enum 本身 就是一个class类
public enum EnumSingleton {

    ENUM_SINGLETON;

    private EnumSingleton(){

    }

    public EnumSingleton getInstance(){
        return ENUM_SINGLETON;
    }
}

class Test{
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.ENUM_SINGLETON;
        EnumSingleton enumSingleton2= EnumSingleton.ENUM_SINGLETON;
        System.out.println(enumSingleton);
        System.out.println(enumSingleton2);
    }
}
