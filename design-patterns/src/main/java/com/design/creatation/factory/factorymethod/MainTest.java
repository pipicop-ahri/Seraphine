package com.design.creatation.factory.factorymethod;


/**
 * 场景：为了解决产品类型增加时，需要修改源码的痛点。改用工厂方法模式
 * 分析：将功能提升一个层级，创建接口或抽象类。因为接口或抽象类具有多实现，所以对应的也就有多功能。
 * 解决：将工厂抽象，造什么车用什么工厂，每个工厂只负责一件事。
 *
 * 问题：当产品添加种类时，就需要在顶级的抽象工具类中添加对应功能。种类特别多时就会提升系统的复杂度。
 *
 * @Title: MainTest
 * @Description: 工厂方法测试类
 * @Author: yj
 * @Date: 2023/5/13 16:49
 * @Version: 1.0
 */
public class MainTest {

	public static void main(String[] args) {
	}
}