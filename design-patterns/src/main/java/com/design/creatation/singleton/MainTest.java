package com.design.creatation.singleton;   // 解决package

/**
 * @Title: MainTest
 * @Description: 单例模式测试类
 * @Author: yj
 * @Date: 2023/5/13 10:55
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        Person boss1 = Person.getBoss();

        Person boss2 = Person.getBoss();

        System.out.println(boss1 == boss2);

    }
}