package com.design.creatation.factory.abstractfactory;

/**
 * 产品等级：一个产品的各种类型，如华为手机，小米手机等
 * 产品族：不同的产品，比汽车、口罩等
 * 创建一个具体的工厂，那这种工厂就可以生产对应的产品。后续如果要添加新的产品类型，只需要扩展类就可以。
 * 保证了开闭原则，对扩展开放，对修改关闭。
 *
 * 再次对每个产品族进行提升，创建各自的接口定义，如 MaskFactory和CarFactory，实际的工厂只需按照他们产品族接口实现即可。
 * 简单工厂、工厂方法、抽象工厂之间的区别
 * 	抽象工厂如果只有一个产品族，那就可以简化成工厂方法，如果工厂方法也只有极少的种类，就可以简化成简单工厂
 *
 * @Title: MainTest
 * @Description: 抽象工厂
 * @Author: yj
 * @Date: 2023/5/19 06:39
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		WuLinFactory factory = new HangZhouCommonMaskFactory();
		AbstractMask mask = factory.newMask();
		mask.protectedMe();

		factory = new WuHanN95MaskFactory();
		factory.newMask().protectedMe();

		factory = new WuLinVanFactory();
		factory.newCar().run();

		factory = new WuLinRacingFactory();
		factory.newCar().run();
	}

}