package com.design.creatation.factory.factorymethod;

/**
 * @Title: MiniCar
 * @Description: 小汽车
 * @Author: yj
 * @Date: 2023/5/13 16:18
 * @Version: 1.0
 */
public class MiniCar extends AbstractCar {

	public MiniCar() {
		this.engine = "柴油机四杠";
	}

	@Override
	void run() {
		System.out.println(this.engine + "--》滴滴滴");
	}
}