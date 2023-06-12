package com.design.behaviour.state;

/**
 * @ClassName: VocationState
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class VocationState implements State{
	@Override
	public void playGame() {
		System.out.println("休假中，一把都不想玩");
	}
}
