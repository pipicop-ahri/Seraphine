package com.design.creatation.factory.simplefactory;

/**
 * @Title: VanCar
 * @Description: 货车
 * @Author: yj
 * @Date: 2023/5/13 16:13
 * @Version: 1.0
 */
public class VanCar extends AbstractCar{

	public VanCar() {
		this.engine = "单杠改动机";
	}

	@Override
	void run() {
		System.out.println(this.engine + "---》哒哒哒");
	}
}