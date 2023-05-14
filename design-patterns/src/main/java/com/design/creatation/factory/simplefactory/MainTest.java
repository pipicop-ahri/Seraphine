package com.design.creatation.factory.simplefactory;

/**
 * 场景：五菱刚起家，只有两种类型的车，需要通过工厂造出来
 * 分析：产品类型极少，可以考虑使用简单工厂
 * 缺点：产品类型增加时，违反开闭原则，需要修改源码，不好维护。
 *
 * @Title: MainTest
 * @Description: 简单工厂测试类
 * @Author: yj
 * @Date: 2023/5/13 16:09
 * @Version: 1.0
 */
public class MainTest {

	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		factory.newCar("van").run();
		factory.newCar("mini").run();
		System.out.println(factory.newCar("zz"));
	}
}