package com.design.structure.bridge;

/**
 * @Title: PhoneOfflineSale
 * @Description: 手机线下渠道
 * @Author: yj
 * @Date: 2023/5/20 11:37
 * @Version: 1.0
 */
public class PhoneOfflineSale extends AbstractSale{
	public PhoneOfflineSale(String price, String type) {
		super(price, type);
	}

	@Override
	String getSaleInfo() {
		return super.getSaleInfo();
	}
}