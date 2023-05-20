package com.design.structure.bridge;

/**
 * @Title: XiaoMiPerformancePhone
 * @Description: 小米性能手机
 * @Author: yj
 * @Date: 2023/5/20 11:17
 * @Version: 1.0
 */
public class XiaoMiPerformancePhone extends AbstractPhone{

	@Override
	String getPhone() {
		return "小米性能手机" + sale.getSaleInfo();
	}
}