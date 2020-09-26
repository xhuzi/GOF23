package com.gof.singleton;

//静态内部内单例模式
public class Holder {

    private Holder(){

    }

    public static Holder getInstance(){

        return InnerClass.HOLDER;
    }

    public static  class InnerClass{
         private static final Holder HOLDER = new Holder();
    }


}
