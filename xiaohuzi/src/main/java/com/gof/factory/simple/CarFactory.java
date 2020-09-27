package com.gof.factory.simple;

/**
 * 静态工厂模式
 * 增加一个新的产品，如果你不修改源代码，做不到
 * 开闭原则
 */
public class CarFactory {

    //方法一
    public static  Car getCar(String car){
        if(car.equals("五菱宏光")){
            return new WuLing();
        }
        if(car.equals("特斯拉")){
            return new Tesla();

        }
        return null;
    }

    //方法二
 public static Car getDaZhong(){
        return new DaZhong();
 }

}
