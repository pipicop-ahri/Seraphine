package com.design.structure.proxy.dynamic.jdk;

import java.util.Arrays;

/**
 * 像装饰器一样，每有一个被代理者，就需要创建一个静态代理类，多了就很麻烦，这时就可以使用动态代理了。
 * 被代理对象必须要实现接口才可以使用JDk提供的动态代理。
 * @Title: MainTest
 * @Description: 动态代理-JDK代理测试类
 * @Author: yj
 * @Date: 2023/5/20 16:35
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		LiveStream liveStream =  new MyLiveStream();
		LiveStream proxy = JdkDynamicProxy.getProxy(liveStream);
		proxy.liveStream();

		// LiveStream proxy = JdkDynamicSimpleProxy.getProxy(liveStream);
		// proxy.liveStream();

		//代理对象只能转成接口类型，不能代理它自己。
		// ((MyLiveStream)proxy).liveStream();
		System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));

	}
}