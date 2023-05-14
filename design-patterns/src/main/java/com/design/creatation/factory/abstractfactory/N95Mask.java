package com.design.creatation.factory.abstractfactory;

/**
 * @Title: N95Mask
 * @Description: 口罩族的某一实现
 * @Author: yj
 * @Date: 2023/5/19 06:57
 * @Version: 1.0
 */
public class N95Mask extends AbstractMask{

	public N95Mask() {
		this.price = 2;
	}

	@Override
	public void protectedMe() {
		System.out.println("N95口罩...超强防护...");
	}
}