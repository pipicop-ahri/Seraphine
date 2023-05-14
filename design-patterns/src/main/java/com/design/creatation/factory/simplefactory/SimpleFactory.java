package com.design.creatation.factory.simplefactory;

/**
 * @Title: SimpleFactory
 * @Description: 简单工厂类
 * @Author: yj
 * @Date: 2023/5/13 16:23
 * @Version: 1.0
 */
public class SimpleFactory {

	public AbstractCar newCar(String engin) {
		// 简单工厂模式的核心方法
		if ("van".equals(engin)) {
			return new VanCar();
		} else if ("mini".equals(engin)) {
			return new MiniCar();
		} else {
			return null;
		}
	}
}