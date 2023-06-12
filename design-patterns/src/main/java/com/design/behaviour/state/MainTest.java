package com.design.behaviour.state;

import java.time.temporal.Temporal;

/**
 * @ClassName: MainTest
 * @Description: 状态模式：状态的流转
 * @Author yj
 * @Date 2023年06月12日
 */
public class MainTest {
	public static void main(String[] args) {
		VocationState vocation = new VocationState();
		STKTeam team = new STKTeam(vocation);
		team.playGame();
		team.nextState(new BeefNoodleState());
		team.playGame();
		team.nextState(new MatchState());
		team.playGame();
	}
}


