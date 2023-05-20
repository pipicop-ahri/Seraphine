package com.design.structure.adapter.clazz;

import com.design.structure.adapter.MoviePlayer;
import com.design.structure.adapter.Player;
import com.design.structure.adapter.Zh_JPTranslator;

/**
 * @Title: MoviePlayerAdapter
 * @Description: 类结构型模式
 * @Author: yj
 * @Date: 2023/5/20 09:15
 * @Version: 1.0
 */
public class MoviePlayerAdapter extends Zh_JPTranslator implements Player {

	private MoviePlayer player;

	public MoviePlayerAdapter(MoviePlayer player) {
		this.player = player;
	}

	@Override
	public String player() {
		player.player();
		//调用其它接口，如果这里不调用其它接口，就成了一个装饰器模式
		translate("你好");
		return null;
	}
}