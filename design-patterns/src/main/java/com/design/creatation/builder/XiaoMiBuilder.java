package com.design.creatation.builder;

import lombok.ToString;

/**
 * @Title: XiaoMiBuilder
 * @Description: 小米手机构建者
 * @Author: yj
 * @Date: 2023/5/19 21:31
 * @Version: 1.0
 */
public class XiaoMiBuilder extends AbstractBuilder {

	public XiaoMiBuilder() {
		phone = Phone.builder().build();
	}

	@Override
	AbstractBuilder customerCpu(String cpu) {
		phone.cpu = cpu;
		return this;
	}

	@Override
	AbstractBuilder customerDisk(String disk) {
		phone.disk = disk;
		return this;
	}

	@Override
	AbstractBuilder customerMemory(String memory) {
		phone.memory = memory;
		return this;
	}

	@Override
	AbstractBuilder customerCamera(String camera) {
		phone.camera = camera;
		return this;
	}
}