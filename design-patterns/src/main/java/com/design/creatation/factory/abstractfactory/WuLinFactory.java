package com.design.creatation.factory.abstractfactory;

/**
 * @Title: WuLinFactory
 * @Description: 五菱总工厂
 * @Author: yj
 * @Date: 2023/5/19 06:42
 * @Version: 1.0
 */
public interface WuLinFactory {

	abstract AbstractCar newCar();

	abstract AbstractMask newMask();
}
