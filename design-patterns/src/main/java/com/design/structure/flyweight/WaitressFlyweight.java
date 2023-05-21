package com.design.structure.flyweight;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Title: WaitnessFlyweight
 * @Description: 具体享元类，要放在池子中的东西，里面定义的享元的内部状态和外部状态
 * @Author: yj
 * @Date: 2023/5/21 09:17
 * @Version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
public class WaitressFlyweight extends AbstractWaitressFlyweight {
	private int id;
	private String name;
	private int age;

	void getService() {
		System.out.println("工号为" + id + "的服务员叫：" + name + "，她今年" + age + "岁，开始为您服务！");
		this.isCanServe = false;
	}

	void endService() {
		System.out.println("工号为" + id + "的服务员结束服务，满意请给五星好评哟！");
		this.isCanServe = true;
	}
}