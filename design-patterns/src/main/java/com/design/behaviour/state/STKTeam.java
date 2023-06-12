package com.design.behaviour.state;

/**
 * @ClassName: STKTeam
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class STKTeam {
	public State state;

	public STKTeam(State state) {
		this.state = state;
	}

	State nextState(State nextState) {
		return state = nextState;
	}
	void playGame() {
		state.playGame();
	}
}
