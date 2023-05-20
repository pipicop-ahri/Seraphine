package com.design.structure.bridge;

/**
 * @Title:
 * @Description: 线上渠道
 * @Author: yj
 * @Date: 2023/5/20 11:35
 * @Version: 1.0
 */
public class PhoneOnlineSale extends AbstractSale{

	public PhoneOnlineSale(String price, String type) {
		super(price, type);
	}

	@Override
	String getSaleInfo() {
		return super.getSaleInfo();
	}
}