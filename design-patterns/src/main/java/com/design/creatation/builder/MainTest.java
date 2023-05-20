package com.design.creatation.builder;

/**
 * 构建者模式：创建东西的细节复杂，还要暴露给调用者。 屏蔽过程，开放细节
 *
 *
 * @Title: MainTest
 * @Description: 构建者模式测试类
 * @Author: yj
 * @Date: 2023/5/19 21:21
 * @Version: 1.0
 */
public class MainTest {

	public static void main(String[] args) {
		AbstractBuilder builder = new XiaoMiBuilder();
		Phone product = builder.customerMemory("2G")
				.customerDisk("2T")
				.customerCpu("2核")
				.customerCamera("2000万")
				.getProduct();
		System.out.println("product = " + product);

		// 使用 Lomback 中的@Builder 注释来链式调用
		Phone.PhoneBuilder phoneBuilder = Phone.builder();
		Phone phone = phoneBuilder.cpu("2核")
				.disk("3T")
				.memory("64G")
				.camera("2亿")
				.build();
		System.out.println("phone = " + phone);

	}
}