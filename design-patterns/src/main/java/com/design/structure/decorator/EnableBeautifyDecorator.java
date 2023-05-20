package com.design.structure.decorator;

/**
 * @Title: EnableBeautifyDecorator
 * @Description: 开启美颜的装饰器具体实现
 * @Author: yj
 * @Date: 2023/5/20 14:35
 * @Version: 1.0
 */
public class EnableBeautifyDecorator implements BeautifyDecorator{

	private MyLiveStream liveStream;

	public EnableBeautifyDecorator(MyLiveStream liveStream) {
		this.liveStream = liveStream;
	}

	@Override
	public void liveStream() {
		// 开始直播
		liveStream.liveStream();

		// 装饰器的功能增强：开启美颜
		//只调用自己的增加方法，增强了MyLiveStream的功能，如果这里调用其它接口，就成了适配器模式。
		enableBeautify();
	}

	@Override
	public void enableBeautify() {
		System.out.println("开启了美颜...");
		System.out.println("人都来了...");
	}
}