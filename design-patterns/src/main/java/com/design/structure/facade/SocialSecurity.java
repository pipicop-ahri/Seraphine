package com.design.structure.facade;

import lombok.NoArgsConstructor;

/**
 * @Title: SocialSecurity
 * @Description: 社会保险
 * @Author: yj
 * @Date: 2023/5/20 21:14
 * @Version: 1.0
 */
@NoArgsConstructor
public class SocialSecurity {
	public void getSocialSecurity(String name){
		System.out.println(name + "正在办理保险！");
	}
}