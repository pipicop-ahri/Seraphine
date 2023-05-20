package com.design.structure.adapter;

/**
 * @Title: MoviePlayer
 * @Description: 电影播放器实现
 * @Author: yj
 * @Date: 2023/5/20 09:03
 * @Version: 1.0
 */
public class MoviePlayer implements Player{

	@Override
	public String player() {
		System.out.println("正在播放苍老师的动作片...");
		String content = "你好！";
		System.out.println("字幕：" + content);
		return content;
	}
}
