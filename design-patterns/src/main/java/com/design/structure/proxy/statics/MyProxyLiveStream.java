package com.design.structure.proxy.statics;

/**
 * 代理什么，要看代理的对象会什么，代理的对象会什么取决于它实现了什么接口，所以代理对象要和被代理对象实现同一接口，保证会的东西一样。
 *
 * @Title: MyProxyLiveStream
 * @Description: 代理对象
 * @Author: yj
 * @Date: 2023/5/20 15:35
 * @Version: 1.0
 */
public class MyProxyLiveStream implements LiveStream{
	private MyLiveStream liveStream;

	public MyProxyLiveStream(MyLiveStream liveStream) {
		this.liveStream = liveStream;
	}

	@Override
	public void liveStream() {
		//功能增强
		System.out.println("直播前的场景渲染...");
		System.out.println("其它增强功能...");

		//既可以使用代理对象的方法，也可能使用自己的代理方法，完全取决于自己。
		liveStream.liveStream();


	}
}