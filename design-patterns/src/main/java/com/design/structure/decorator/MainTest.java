package com.design.structure.decorator;

/**
 * Decorator Pattern:
 * 	只增加一个类，和适配器模式很像，但适配器模式除了增强类还会连接两个类。
 *
 * @Title: MainTest
 * @Description: 装饰器模式
 * @Author: yj
 * @Date: 2023/5/20 14:25
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		// 装饰前
		// MyLiveStream liveStream = new MyLiveStream();
		// liveStream.liveStream();

		// 装饰后
		EnableBeautifyDecorator beautifyDecorator = new EnableBeautifyDecorator(new MyLiveStream());
		beautifyDecorator.liveStream();
	}
}