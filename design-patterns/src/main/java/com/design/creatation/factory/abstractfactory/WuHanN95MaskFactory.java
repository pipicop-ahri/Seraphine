package com.design.creatation.factory.abstractfactory;

/**
 * @Title: WuHanN95MaskFactory
 * @Description: 武汉N95口罩工厂
 * @Author: yj
 * @Date: 2023/5/19 07:04
 * @Version: 1.0
 */
public class WuHanN95MaskFactory implements MaskFactory {

	@Override
	public AbstractMask newMask() {
		return new N95Mask();
	}

}