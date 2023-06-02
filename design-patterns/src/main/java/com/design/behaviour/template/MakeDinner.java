package com.design.behaviour.template;

/**
 * @ClassName: MakeDinner
 * @Description:
 * @Author yj
 * @Date 2023年05月22日
 */
public class MakeDinner extends CookTemplate{
	@Override
	void addWater() {
		System.out.println("customer add water");
	}

	@Override
	void addFood() {
		System.out.println("customer add food");
	}
}
