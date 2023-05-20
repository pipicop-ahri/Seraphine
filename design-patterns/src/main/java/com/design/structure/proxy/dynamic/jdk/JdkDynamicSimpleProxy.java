package com.design.structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title: JdkDynamicSimpleProxy
 * @Description: JDK动态代理的匿名内部类实现
 * @Author: yj
 * @Date: 2023/5/20 18:07
 * @Version: 1.0
 */
public class JdkDynamicSimpleProxy {
	/**
	 * static修饰：直接类调用
	 * @author YaoJian
	 * @date 2023/5/20 16:49
	 * @param obj obj
	 * @return T
	 **/
	public static<T> T getProxy(T obj) {
		/**
		 * JDK提供的代理类，获取代理对象，需要传递下面三个参数。
		 * ClassLoader loader ：类加载器
		 * Class<?>[] interfaces：该被代理对象实现的所有接口列表
		 * InvocationHandler h ：调用处理器
		 **/
		Object o = Proxy.newProxyInstance(
				obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(), //告诉Proxy我有哪些功能
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("这里是真正代理原方法的地方");
						System.out.println("功能增强...");
						Object o = method.invoke(obj, args);
						return o;
					}
				}); //提供一个Proxy定义的处理器的实现
		return (T) o;
	}
}