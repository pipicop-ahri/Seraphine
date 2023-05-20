package com.design.structure.proxy.statics;

/**
 * @Title: MainTest
 * @Description: 静态代理测试类
 * @Author: yj
 * @Date: 2023/5/20 15:34
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		//静态代理和装饰器一模一样
		MyProxyLiveStream proxyLiveStream = new MyProxyLiveStream(new MyLiveStream());
		proxyLiveStream.liveStream();
	}
}