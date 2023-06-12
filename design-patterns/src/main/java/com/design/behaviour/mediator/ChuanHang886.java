package com.design.behaviour.mediator;

/**
 * @ClassName: ChuanHang886
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class ChuanHang886  extends Captain{
	@Override
	void land() {
		System.out.println("ChuanHang886请求着陆");
	}

	@Override
	void fly() {
		System.out.println("ChuanHang886请求起飞");
	}

	@Override
	void success() {
		System.out.println("请求成功");
	}
}