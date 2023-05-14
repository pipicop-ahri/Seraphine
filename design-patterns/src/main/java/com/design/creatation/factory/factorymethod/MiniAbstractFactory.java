package com.design.creatation.factory.factorymethod;

/**
 * @Title: MiniAbstractFactory
 * @Description: Mini工厂
 * @Author: yj
 * @Date: 2023/5/13 17:30
 * @Version: 1.0
 */
public class MiniAbstractFactory extends AbstractFactory{
	@Override
	AbstractCar newCar() {
		return new MiniCar();
	}
}