package com.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Title: SexEnum
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/7 20:58
 * @Version: 1.0
 */
@AllArgsConstructor
@Getter
public enum SexEnum{
	MALE(1,"男"),
	FEMALE(2,"女");

	@EnumValue
	private final Integer value;


	private final String desc;

	public Integer getValue() {
		return value;
	}

	// @JsonValue
	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return this.desc;
	}
}