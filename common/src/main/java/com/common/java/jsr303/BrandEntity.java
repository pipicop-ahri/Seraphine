package com.common.java.jsr303;

import com.common.java.jsr303.customer.ListValue;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 品牌ID */
	@NotNull(message = "修改必须有品牌id",groups = UpdateGroup.class) //使用更新组校验
	@Null(message = "新增时id必须为空",groups = AddGroup.class) //使用添加组校验
	private Long brandId;
	/**
	 * 品牌名F
	 */
	@NotBlank(message = "品牌名必须提交")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotBlank(message = "地址必须不为空")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	
	/**
	 * 检索首字母
	 */
	//正则表达式
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索的首字母必须是字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "排序必须大于等于0")
	private Integer sort;

	@NotNull
	@ListValue(nums = {0,1},message = "状态必须为0或1")
	private Integer showStatus;

}