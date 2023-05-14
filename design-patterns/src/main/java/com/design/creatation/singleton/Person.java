package com.design.creatation.singleton;

import java.lang.management.MemoryManagerMXBean;

/**
 * @Title: MainTest
 * @Description: 单例对象实体
 * @Author: yj
 * @Date: 2023/5/13 10:55
 * @Version: 1.0
 */
public class Person {

    /** 饿汉：类刚初始化的时候就创建出来 */
    // private final static Person instance = new Person();
    //
    // // 构造私有化
    // private Person() {
    // }
    //
    // public static Person getBoss(){
    //     return instance;
    // }


    /**
     * 懒汉：这个对象被用到的时候才创建
     */
    private volatile static Person instance;


    /**
     * 单例模式必须私有构造
     * @author YaoJian
     * @date 2023/5/13 14:47
     **/
    private Person() {
        System.out.println("Person构造执行了...");
    }

    /**
     * 问题：多并发时，多个线程同时进来，判断对象为空，再执行就会创建出多个对象
     * 分析：加锁
     * 1.加类锁，public synchronized static Person getBoss(),锁太多 效率不高
     * 2.双重锁校验 + 禁止重排序
     *      禁止重排序：创建对象有三个步骤，
     *              1.分配内存空间
     *              2.初始化对象
     *              3.将对象的引用指向刚分配的内存空间
     *          但有的编译器为了性能会将对象创建重排序，变成
     *              1.分配内存空间
     *              2.将对象的引用指向刚分配的内存空间
     *              3.初始化对象
     *          ，这会导致第一个线程创建对象在刚走完前两步时，第二个线程进来判断对象已经有了（尚未初始化完成）。就等于是访问了一个未完成的对象导致报错。
     *          要解决这个问题，就需要加volatile禁止重排序。
     */
    public static Person getBoss() {
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }


}
