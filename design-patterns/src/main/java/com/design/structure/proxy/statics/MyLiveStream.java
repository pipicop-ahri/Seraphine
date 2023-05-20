package com.design.structure.proxy.statics;

import com.design.structure.decorator.LiveStream;

/**
 * @Title: MyLiveStream
 * @Description: 我的直播
 * @Author: yj
 * @Date: 2023/5/20 14:34
 * @Version: 1.0
 */
public class MyLiveStream implements LiveStream {
	@Override
	public void liveStream() {
		System.out.println("我正在直播。。。");
	}
}