package com.design.behaviour.template;

/**
 * Template Pattern
 * 	模版中定义一部分，留一些实现给调用者自己实现
 * @ClassName: MainTest
 * @Description: 模板模式
 * @Author yj
 * @Date 2023年05月22日
 */
public class MainTest {
	public static void main(String[] args) {
		MakeDinner dinner = new MakeDinner();
		dinner.makeDinner();
	}
}
