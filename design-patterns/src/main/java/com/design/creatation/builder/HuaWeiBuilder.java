package com.design.creatation.builder;

/**
 * @ClassName: HuaWeiBuilder
 * @Description:
 * @Author yj
 * @Date 2023年05月24日
 */
public class HuaWeiBuilder extends AbstractBuilder{

	public HuaWeiBuilder() {
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
