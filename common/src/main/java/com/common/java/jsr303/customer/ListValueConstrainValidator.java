package com.common.java.jsr303.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @Title: ListValueConstrainValidator
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/8 22:08
 * @Version: 1.0
 */
public class ListValueConstrainValidator implements ConstraintValidator<ListValue,Integer> {

	private Set<Integer> set = new HashSet<>();

	/**
	 * 初始化
	 * @param cons cons
	 **/
	@Override
	public void initialize(ListValue cons) {
		int[] nums = cons.nums();
		for (int num : nums) {
			set.add(num);
		}
	}

	/**
	 * 判断是否校验成功
	 * @param value 需要校验的值
	 * @param context context
	 * @return 是否校验成功
	 **/
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return set.contains(value);
	}
}