package com.design.behaviour.mediator;

/**
 * @ClassName: SiChuanAviation
 * @Description:
 * @Author yj
 * @Date 2023年06月12日
 */
public class SiChuanAviation extends Captain{
	@Override
	void land() {
		System.out.println("SiChuanAviation请求着陆");
	}

	@Override
	void fly() {
		System.out.println("SiChuanAviation请求起飞");
	}

	@Override
	void success() {
		System.out.println("SiChuanAviation请求成功");
	}
}
