package com.design.creatation.factory.abstractfactory;

/**
 * @Title: MaskFactory
 * @Description: 五菱口罩总工厂
 * @Author: yj
 * @Date: 2023/5/19 07:28
 * @Version: 1.0
 */
public interface MaskFactory extends WuLinFactory {
	@Override
	default AbstractCar newCar() {
		return null;
	}

	@Override
	AbstractMask newMask();
}