package com.design.structure.bridge;

/**
 * @Title: XiaoMiCommonPhone
 * @Description: 小米普通手机
 * @Author: yj
 * @Date: 2023/5/20 11:12
 * @Version: 1.0
 */
public class XiaoMiCommonPhone extends AbstractPhone{

	@Override
	String getPhone() {
		return "XiaoMiCommonPhone" + sale.getSaleInfo() ;
	}


}