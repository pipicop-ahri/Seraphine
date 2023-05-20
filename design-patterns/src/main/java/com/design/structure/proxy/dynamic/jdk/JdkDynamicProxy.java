package com.design.structure.proxy.dynamic.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title: JdkDynamicProxy
 * @Description: Jdk动态代理实现
 * @Author: yj
 * @Date: 2023/5/20 16:38
 * @Version: 1.0
 */
public class JdkDynamicProxy<T> implements InvocationHandler{

	private final T target;
	public JdkDynamicProxy(T target) {
		this.target = target;
	}

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
					new JdkDynamicProxy<T>(obj)); //提供一个Proxy定义的处理器的实现

		return (T) o;
	}

	/**
	 * JDK提供的处理器定义，这里是自己的实现
	 * @author YaoJian
	 * @date 2023/5/20 16:59 
	 * @param proxy 代理对象
	 * @param method 原方法签名，查看方法信息时使用
	 * @param args 原方法的参数
	 * @return 原方法的返回结果
	 **/
	@Override
	public Object invoke(Object proxy,
						 Method method,
						 Object[] args) throws Throwable {
		System.out.println("这里是真正代理原方法的地方");
		System.out.println("功能增强...");
		// 反射执行
		Object obj = method.invoke(target, args);
		return obj;
	}


}