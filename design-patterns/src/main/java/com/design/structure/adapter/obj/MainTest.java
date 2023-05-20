package com.design.structure.adapter.obj;

import com.design.structure.adapter.MoviePlayer;
import com.design.structure.adapter.Zh_JPTranslator;

/**
 * @Title: MainTest
 * @Description: 对象结构型模式测试类
 * @Author: yj
 * @Date: 2023/5/20 09:33
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		MoviePlayerAdapter playerAdapter = new MoviePlayerAdapter(new MoviePlayer(),new Zh_JPTranslator());
		playerAdapter.player();
	}
}