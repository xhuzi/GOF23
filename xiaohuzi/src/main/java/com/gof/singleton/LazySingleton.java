package com.gof.singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//懒汉单例模式   用的时候才创建
public class LazySingleton {

    private static Boolean xiaohuzi = false;



    private LazySingleton() {
        //这里加个判断 防止暴力破解

            synchronized (LazySingleton.class){

                if(xiaohuzi==false){
                    xiaohuzi = true;
                }else {

                        throw new RuntimeException("反射破坏");
                }
        }

        //System.out.println(Thread.currentThread().getName() + "OK");
    }

    //volatile 保证不会发生指令重排
    private  static volatile LazySingleton lazySingleton;

    //双重检测模式的 懒汉式单例  DCL懒汉式单例
    public  static LazySingleton getInstance() {
        //加锁
        if(lazySingleton==null) {
            //如果等于null进来先 加锁 确保只有一个对象
            synchronized (LazySingleton.class) {
                //在创建对象
                if (lazySingleton == null) {
                     lazySingleton = new LazySingleton();    //不是一个原子性操作
                    /**
                     * 1、分配内存空间
                     * 2、执行构造方法，初始化对象
                     * 3、把这个对象指向这个空间
                     *   这里可能会发生指令重排  ，我们期望是  123  但是有可能是132
                     *   如果 3 这个时候执行了，这个时候可能有一条B线程进来 它认为这个对象已经指向这个空间了就不会再走 2 了
                     */
                }

            }
        }

        // 这个还没有完成构造 这个空间还是一片虚无，不会创建对象，所以会发生问题
        return lazySingleton;   //这里单线程的时候不会有问题，多线程并发会出现问题
    }



    public static void main(String[] args) throws Exception {
       // LazySingleton lazySingleton1 = LazySingleton.getInstance();
        //通过反射破解单例模式
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor(null);
        //暴力破解，无视私有构造器
        declaredConstructor.setAccessible(true);

        //破解字段
        Field field = lazySingletonClass.getDeclaredField("xiaohuzi");
        field.setAccessible(true);

        LazySingleton lazySingleton = declaredConstructor.newInstance();  //如果不去getInstance创建对象 直接反射去多创建 还是会破坏

        field.set(lazySingleton,false);

        //通过反射创造对象

        LazySingleton lazySingleton2 = declaredConstructor.newInstance();

        //连个对象不一样
        System.out.println(lazySingleton);  // com.gof.singleton.LazySingleton@1540e19d   Caused by: java.lang.RuntimeException: 反射破坏
        System.out.println(lazySingleton2); // com.gof.singleton.LazySingleton@677327b6

    }







    /**
     * for (int i = 0; i < 10; i++) {
     * new Thread(() -> {
     * LazySingleton.getInstance();
     * }).start();
     * }
     * Thread-0OK  出现了两个对象  这个时候可以加锁
     * Thread-1OK
     *
     * @param args
     */

}
