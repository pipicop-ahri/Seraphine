package com.design.structure.proxy.dynamic.cglib;

/**
 * 使用JDk自带的代理必须要实现接口，而Cglib就不用，它只需要提供一个类。
 * 连这个类的对象都不用创建，它会在底层去继承这个类，然后拥有它的功能。
 *
 * @Title: MainTest
 * @Description: 动态代理-Cglib代理
 * @Author: yj
 * @Date: 2023/5/20 17:48
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		LiveStream proxy = CglibDynamicProxy.getProxy(new MyLiveStream());
		proxy.liveStream();
	}
}