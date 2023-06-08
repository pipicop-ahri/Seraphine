package com.common.java.jsr303;


import javax.validation.constraints.NotBlank;

/**
 * @Title: User
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/8 20:37
 * @Version: 1.0
 */
public class User {

	private String id;
	@NotBlank
	private String name;

	private Integer age;
	private Integer sex;
	private String email;
	private Integer sort;
}