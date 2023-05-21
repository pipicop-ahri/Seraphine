package com.design.structure.flyweight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Title: ZuDao
 * @Description: 享元工厂类：足道店
 * @Author: yj
 * @Date: 2023/5/21 09:40
 * @Version: 1.0
 */
public class ZuDao {

	private static Map<String, AbstractWaitressFlyweight> waitressPool = new HashMap<>();

	/** 开店前得准备好一些女服务员 */
	static {
		waitressPool.put("1111", new WaitressFlyweight(111,"Janna",20));
		waitressPool.put("9527", new WaitressFlyweight(9527, "Ahri", 18));
	}

	/**
	 * 对外提供添加女服务员的方法
	 * @author YaoJian
	 * @date 2023/5/21 09:49
	 * @param waitress 服务员
	 **/
	public static void addWaitress(AbstractWaitressFlyweight waitress){
		waitressPool.put(String.valueOf(UUID.randomUUID()),waitress);
	}

	/**
	 * 对外提供获取女服务员的方法
	 * @author YaoJian
	 * @date 2023/5/21 09:50
	 * @return 返回服务员
	 **/
	public static AbstractWaitressFlyweight getWaitress(String name){
		AbstractWaitressFlyweight waitress = waitressPool.get(name);
		if (waitress == null) {
			// 指定工号服务员不存在，从其它列表中随机返回一个。
			Collection<AbstractWaitressFlyweight> values = waitressPool.values();
			for (AbstractWaitressFlyweight value : values) {
				if (value.isCanServe) {
					return value;
				}
			}
			return null;
		}
		return waitress;
	}
}