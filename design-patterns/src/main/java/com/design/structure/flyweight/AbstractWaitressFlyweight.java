package com.design.structure.flyweight;

/**
 * @Title: AbstractWaitressFlyweight
 * @Description: 女服务器享元功能定义:享元的外部状态（不可共享属性）留给外部进行改变的接口
 * @Author: yj
 * @Date: 2023/5/21 09:12
 * @Version: 1.0
 */
public abstract class AbstractWaitressFlyweight {
	/** 外部属性，类似连接池中连接的状态，当用完后就是空闲状态 */
	public Boolean isCanServe = true;

	public Boolean isCanServe(){
		return this.isCanServe;
	}

	 abstract void getService();
	abstract void endService();




}