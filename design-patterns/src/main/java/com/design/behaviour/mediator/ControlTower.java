package com.design.behaviour.mediator;

import java.util.List;

/**
 * @ClassName: ControlTower
 * @Description: 停机坪抽象
 * @Author yj
 * @Date 2023年06月12日
 */
public abstract class ControlTower {
	public List<Captain> captains;
	public Boolean isApprove;
	abstract Boolean acceptRequest();

}
