package com.design.behaviour.state;

/**
 * @ClassName: MatchState
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class MatchState implements State{
	@Override
	public void playGame() {
		System.out.println("比赛状态，战无不胜~");
	}
}
