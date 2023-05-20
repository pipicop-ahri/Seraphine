package com.design.structure.adapter.clazz;

import com.design.structure.adapter.MoviePlayer;

/**
 * @Title: MainTest
 * @Description: 类结构型模式测试类
 * @Author: yj
 * @Date: 2023/5/20 09:28
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		MoviePlayer player = new MoviePlayer();
		// 要适配谁就传谁的对象进来
		MoviePlayerAdapter playerAdapter = new MoviePlayerAdapter(player);
		playerAdapter.player();

	}
}