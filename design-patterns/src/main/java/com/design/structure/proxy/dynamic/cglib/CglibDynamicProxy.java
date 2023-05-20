package com.design.structure.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title: CglibDynamicProxy
 * @Description: Cglib动态代理实现
 * @Author: yj
 * @Date: 2023/5/20 17:50
 * @Version: 1.0
 */
public class CglibDynamicProxy {

	public static<T> T getProxy(T t) {
		// 1.创建增强器
		Enhancer enhancer = new Enhancer();
		// 2.继承父类
		enhancer.setSuperclass(t.getClass());
		// 3.设置回调
		enhancer.setCallback(new MethodInterceptor() {
			/**
			 * Cglib的回调实现：方法拦截器
			 * @author YaoJian
			 * @date 2023/5/20 17:57
			 * @param o 被增强器创建的代理对象
			 * @param method 为了获取原方法信息,不能用这个调，会递归调用炸掉。
			 * @param objects 原方法参数
			 * @param methodProxy 代理方法，代理原来方法的方法
			 * @return 代理目标对象后的返回结果
			 **/
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("真正的代理方法实现");
				Object obj = methodProxy.invokeSuper(o, objects);
				return obj;
			}
		});
		// 4.创建代理对象
		Object o = enhancer.create();
		return (T) o;
	}
}