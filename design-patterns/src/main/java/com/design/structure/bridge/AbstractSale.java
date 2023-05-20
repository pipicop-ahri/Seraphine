package com.design.structure.bridge;

/**
 * @Title: AbstractSale
 * @Description: 渠道的定义
 * @Author: yj
 * @Date: 2023/5/20 11:07
 * @Version: 1.0
 */
public class AbstractSale {

	private String price;
	private String type;

	public AbstractSale(String price, String type) {
		this.price = price;
		this.type = type;
	}

	String getSaleInfo(){
		return "渠道" + type + ",价格是:" + price;
	}


}