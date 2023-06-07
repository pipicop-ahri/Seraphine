package com.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: SexEnum
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/7 20:58
 * @Version: 1.0
 */
@Getter
@AllArgsConstructor
public enum SexEnum{
	MALE(1,"男"),
	FEMALE(2,"女");
	private final Integer value;
	private final String desc;
}