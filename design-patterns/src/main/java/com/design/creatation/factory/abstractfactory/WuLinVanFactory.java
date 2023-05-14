package com.design.creatation.factory.abstractfactory;

/**
 * @Title: WuLinVanFactory
 * @Description: 五菱货车生产工厂
 * @Author: yj
 * @Date: 2023/5/19 07:06
 * @Version: 1.0
 */
public class WuLinVanFactory extends CarFactory{

	@Override
	public AbstractCar newCar() {
		return new VanCar();
	}

}