package com.design.creatation.factory.factorymethod;

/**
 * @Title: RacingAbstractFactory
 * @Description: 赛车工厂
 * @Author: yj
 * @Date: 2023/5/13 17:22
 * @Version: 1.0
 */
public class RacingAbstractFactory extends AbstractFactory{
	@Override
	AbstractCar newCar() {
		return new RacingCar();
	}
}