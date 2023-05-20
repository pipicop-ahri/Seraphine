package com.design.structure.facade;

import lombok.NoArgsConstructor;

/**
 * @Title: PoliceStation
 * @Description: 公安局
 * @Author: yj
 * @Date: 2023/5/20 21:10
 * @Version: 1.0
 */
@NoArgsConstructor
public class PoliceStation {
	public void newPeople(String name){
		System.out.println(name + "在办理户口！");
	}
}