package com.design.structure.adapter;

import com.design.structure.adapter.clazz.MoviePlayerAdapter;

/**
 * 适配器模式：联接两个不同接口之间适配的桥梁
 * 场景：有A、B两个接口功能到不干涉，现在因为需求在调用 A 接口的时候还需要调用 B 接口的功能，如果直接在 A 接口中加调用 B 接口的方法，
 * 就违反了开闭原则，要想做到对扩展开放，对修改关闭，我们应该创建一个新的类作为适配器，来帮忙我们兼容两个不同接口之间的调用。
 *
 *  目标对象	->	A 接口：MoviePlayer：电影播放器
 *  适配者	->	B 接口：Translate：字幕翻译器
 *  适配器	->	MoviePlayerAdapter：兼容 A、B 接口，在播放电影的同时，还要翻译字幕。
 *
 *  结构型模式：关注的是如何整合类与对象的关系
 *  	类结构型模式：关心类的组合，由多个类组合成一个更大的类，通过继承实现。
 *  	对象结构型模式：关心类与对象的组合，通过在一个类中定义另一个类的实例对象实现。
 *  又根据合成复用原则：系统中尽量使用关联关系来替代继承关系，所以对象结构型模式要更多一些。
 *
 * @Title: MainTest
 * @Description: 适配器模式测试类
 * @Author: yj
 * @Date: 2023/5/20 05:39
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		MoviePlayer player = new MoviePlayer();
		player.player();

	}
}