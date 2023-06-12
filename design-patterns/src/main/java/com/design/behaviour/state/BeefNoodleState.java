package com.design.behaviour.state;

/**
 * @ClassName: BeefNoodleState
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class BeefNoodleState implements State{
	@Override
	public void playGame() {
		System.out.println("刚吃完牛肉面，打了一把输了。。。");
	}
}
