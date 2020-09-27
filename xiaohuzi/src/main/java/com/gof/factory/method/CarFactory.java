package com.gof.factory.method;

import com.gof.factory.simple.DaZhong;

/**
 * 静态工厂模式
 * 增加一个新的产品，如果你不修改源代码，做不到
 * 开闭原则
 */
public interface CarFactory{

    Car car();


}
