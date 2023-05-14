package com.design.creatation.factory.abstractfactory;

/**
 * @Title: WuLinRacingFactory
 * @Description: 五菱赛车生产工厂
 * @Author: yj
 * @Date: 2023/5/19 07:07
 * @Version: 1.0
 */
public class WuLinRacingFactory extends CarFactory{

	@Override
	public AbstractCar newCar() {
		return new RacingCar();
	}

}