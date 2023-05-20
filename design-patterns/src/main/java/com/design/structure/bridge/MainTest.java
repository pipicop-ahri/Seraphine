package com.design.structure.bridge;

/**
 * Bridge Pattern
 * 比如要实现一种小米手机，不使用桥接模式：
 * 	当它有有两个维度属性时，分别是信息（性能和普通）、渠道（线上和线下）的时候，要表示所有的类型，就需要创建4个类来表示。
 *  	小米性能线上手机
 *  	小米性能线下手机
 *  	小米普通线上手机
 *  	小米普通线下手机
 *	当它有有三个维度属性时，分别是信息（性能、普通、旗舰）、渠道（线上、线下、内购）的时候，要表示所有的类型，就需要创建9个类来表示。
 *		小米性能线上手机、小米性能线下手机、小米性能内购手机
 *    	小米普通线上手机、小米普通线下手机、小米普通内购手机
 *    	小米旗舰线上手机、小米旗舰线下手机、小米旗舰内购手机
 * 	有m种信息和n种渠道时就需要mxn个类来表示，这对于扩展来说是及其恶心的。
 *============================================================================================================
 * 使用桥接模式：
 * 	手机原来只有信息属性，现在要加一个渠道属性，但是可能会有多个渠道，这个多个渠道就属性第二维度了，需要将它分离出去。使用自己的独立实现。
 * 	这样一来，无论第二维度有多少实现都只需要新增它自己的实现，而不影响原来的手机定义。最后再使用的时候将第二维度的具体实现传进去即可。
 * 	大大减少了代码的耦合度。
 *
 * @Title: MainTest
 * @Description: 桥接模式测试类
 * @Author: yj
 * @Date: 2023/5/20 10:39
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		//普通手机
		AbstractPhone commonPhone = new XiaoMiCommonPhone();
		commonPhone.setSale(new PhoneOnlineSale("1000","线上"));
		String phone = commonPhone.getPhone();
		System.out.println("phone = " + phone);

		//性能手机
		XiaoMiPerformancePhone performancePhone = new XiaoMiPerformancePhone();
		performancePhone.setSale(new PhoneOfflineSale("2000","线下"));
		String phone1 = performancePhone.getPhone();
		System.out.println("phone1 = " + phone1);

	}
}































