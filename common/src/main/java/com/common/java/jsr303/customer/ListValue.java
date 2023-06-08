package com.common.java.jsr303.customer;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Title: ListValue
 * @Description: 自定义参数校验注解
 * @Author: yj
 * @Date: 2023/6/8 22:10
 * @Version: 1.0
 */
@Documented
@Constraint(validatedBy = { ListValueConstrainValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface ListValue {
	String message() default "{javax.validation.constraints.NotBlank.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	int[] nums() default {};
}
