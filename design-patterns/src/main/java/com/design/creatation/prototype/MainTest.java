package com.design.creatation.prototype;

/**
 * 场景: 有一个自己的GuiguMybatis框架,它从数据库中查询用户数据并封装成一个对象.
 *
 * 问题1: 当有1000个线程来同时查同一条记录,那这个对象就会被创建1000次,很浪费性能,该怎么办?
 * 分析: 使用缓存,(从请求1000次数据库减少到请求一次,提高性能)
 * 解决: 第一次缓存没有查数据库,查到并往缓存中放一份,后续再来就直接从缓存中取,但此时又会出现新的问题.
 *
 * 问题2: 当A线程查到张三这个对象后给此对象重新赋值,后面的结程查的是张三,得到的却全是李四了.这该怎么处理?
 * 分析: 这个时候就可以使用原型模式了(让后续需要操作这个对象的线程之间不会产生冲突,结合上面的还巧妙的少请求了数据库)
 * 解决: 让GuiguMybatis可以克隆,并提供克隆的具体实现,当第一次从数据库中查到返回的是原型，后续从缓存中查到都直接返回张三的克隆体,这样后续线程的操作就不会影响到了.
 *
 * @Title: MainTest
 * @Description: 原型模式测试类
 * @Author: yj
 * @Date: 2023/5/13 13:50
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        GuiguMybatis mybatis = new GuiguMybatis();

        User user1 = mybatis.getUser("张三");
        System.out.println("第一次查询数据库，user=" + user1.getName());

        user1.setName("李四");
        System.out.println("自己更改的用户名user=" + user1.getName());

        User user2 = mybatis.getUser("张三");
        System.out.println("第2次查用户user=" + user2.getName());

        User user3 = mybatis.getUser("张三");
        System.out.println("第3次查用户user=" + user3.getName());

        User user4 = mybatis.getUser("张三");
        System.out.println("第4次查用户user=" + user4.getName());

        System.out.println(user1 == user2);
        System.out.println(user2 == user3);

    }
}