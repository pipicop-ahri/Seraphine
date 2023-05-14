package com.design.creatation.factory.abstractfactory;

/**
 * @Title: HangZhouCommonMaskFactory
 * @Description: 杭州普通医用口罩生产工厂
 * @Author: yj
 * @Date: 2023/5/19 07:05
 * @Version: 1.0
 */
public class HangZhouCommonMaskFactory implements MaskFactory {

	@Override
	public AbstractMask newMask() {
		return new CommonMask();
	}

}