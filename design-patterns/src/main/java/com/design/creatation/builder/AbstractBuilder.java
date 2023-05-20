package com.design.creatation.builder;

/**
 * @Title: AbstractBuilder
 * @Description: 构造者的顶级抽象类
 * @Author: yj
 * @Date: 2023/5/19 21:29
 * @Version: 1.0
 */
public abstract class AbstractBuilder {
	Phone phone;

	abstract AbstractBuilder customerCpu(String cpu);

	abstract AbstractBuilder customerDisk(String disk);

	abstract AbstractBuilder customerMemory(String memory);

	abstract AbstractBuilder customerCamera(String camera);

	Phone getProduct(){
		return phone;
	}
}