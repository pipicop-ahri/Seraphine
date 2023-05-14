package com.design.creatation.factory.factorymethod;


/**
 * @Title: AbstractFactory
 * @Description: 抽象工厂方法的顶级类
 * @Author: yj
 * @Date: 2023/5/13 16:55
 * @Version: 1.0
 */
public abstract class AbstractFactory {

	private String engine;

	abstract AbstractCar newCar();
}