package com.design.creatation.builder;

import lombok.Builder;
import lombok.ToString;

/**
 * 只提供get方法，不可以私自赋值，必须通过构造者来赋值。
 *
 * @Title: Phone
 * @Description: 手机类
 * @Author: yj
 * @Date: 2023/5/19 21:23
 * @Version: 1.0
 */
@ToString
@Builder
public class Phone {
	// protected：受保护的，它修饰的属性表示只能在当前包下使用。
	protected String memory;
	protected String cpu;
	protected String camera;
	protected String disk;

	public String getMemory() {
		return memory;
	}

	public String getCpu() {
		return cpu;
	}

	public String getCamera() {
		return camera;
	}

	public String getDisk() {
		return disk;
	}
}