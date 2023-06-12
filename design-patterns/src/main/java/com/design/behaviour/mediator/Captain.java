package com.design.behaviour.mediator;

/**
 * @ClassName: Captain
 * @Description: 机长抽象
 * @Author yj
 * @Date 2023年06月12日
 */
public abstract class Captain {
	private ControlTower controlTower;

	abstract void land();
	abstract void fly();
	abstract void success();
}

