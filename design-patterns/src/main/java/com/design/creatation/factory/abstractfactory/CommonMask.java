package com.design.creatation.factory.abstractfactory;

/**
 * @Title: CommonMask
 * @Description: 口罩族的某一实现
 * @Author: yj
 * @Date: 2023/5/19 06:59
 * @Version: 1.0
 */
public class CommonMask extends AbstractMask {

	public CommonMask() {
		this.price = 1;
	}

	@Override
	public void protectedMe() {
		System.out.println("普通医用口罩...");
	}
}