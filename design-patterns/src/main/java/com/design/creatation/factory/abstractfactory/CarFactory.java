package com.design.creatation.factory.abstractfactory;

/**
 * @Title: CarFactory
 * @Description: 五菱汽车总工厂
 * @Author: yj
 * @Date: 2023/5/19 07:25
 * @Version: 1.0
 */
public abstract class CarFactory implements WuLinFactory{
	@Override
	public abstract AbstractCar newCar();

	@Override
	public AbstractMask newMask() {
		return null;
	}
}
