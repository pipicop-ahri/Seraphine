package com.design.structure.facade;

import lombok.NoArgsConstructor;

/**
 * @Title: EducationBureau
 * @Description: 教育局
 * @Author: yj
 * @Date: 2023/5/20 21:13
 * @Version: 1.0
 */
@NoArgsConstructor
public class EducationBureau {
	public void getSchool(String name){
		System.out.println(name + "给孩子办理入学手续！");
	}
}