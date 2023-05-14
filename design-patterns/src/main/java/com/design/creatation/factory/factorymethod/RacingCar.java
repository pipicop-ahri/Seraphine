package com.design.creatation.factory.factorymethod;


/**
 * @Title: RacingCar
 * @Description:
 * @Author: yj
 * @Date: 2023/5/13 17:22
 * @Version: 1.0
 */
public class RacingCar extends AbstractCar{
	public RacingCar() {
		this.engine = "8V发动机";
	}

	@Override
	void run() {
		System.out.println(this.engine + "---> 嗖......");
	}
}