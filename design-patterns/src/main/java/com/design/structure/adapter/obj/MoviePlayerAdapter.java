package com.design.structure.adapter.obj;

import com.design.structure.adapter.MoviePlayer;
import com.design.structure.adapter.Player;
import com.design.structure.adapter.Translator;

/**
 * @Title: MoviePlayerAdapter
 * @Description: 对象结构型模式
 * @Author: yj
 * @Date: 2023/5/20 09:15
 * @Version: 1.0Ø
 */
public class MoviePlayerAdapter implements Player {

	private Translator translate;

	private MoviePlayer player;

	public MoviePlayerAdapter(MoviePlayer player,Translator translate) {
		this.player = player;
		this.translate = translate;
	}

	@Override
	public String player() {
		player.player();
		translate.translate("你好");
		return null;
	}
}