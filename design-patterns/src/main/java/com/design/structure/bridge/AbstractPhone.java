package com.design.structure.bridge;

/**
 * @Title: AbstractPhone
 * @Description: 手机的定义
 * @Author: yj
 * @Date: 2023/5/20 11:05
 * @Version: 1.0
 */
public abstract class AbstractPhone {

	/** 信息 */
	public String info;

	/** 销售渠道 */
	public AbstractSale sale;

	abstract String getPhone();

	public void setSale(AbstractSale sale) {
		this.sale = sale;
	}


}