package com.design.behaviour.template;

/**
 * @ClassName: CookTemplate
 * @Description:
 * @Author yj
 * @Date 2023年05月22日
 */
public abstract class CookTemplate {

	public void makeDinner(){
		addRice();
		addWater();
		addFood();
		cookSuccess();
	}

	private void addRice(){
		System.out.println("add rice");
	}

	abstract  void addWater();

	abstract void addFood();

	private void cookSuccess(){
		System.out.println("cook success!");
	}
}
