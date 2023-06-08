package com.common.java.jsr303;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.annotation.HandlesTypes;
import java.util.HashMap;

/**
 * @Title: GlobalExceptionControllerAdvice
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/8 21:29
 * @Version: 1.0
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.common.java")
public class GlobalExceptionControllerAdvice {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public Result handleValidException(MethodArgumentNotValidException e) {
		log.error("数据校验出现问题：{}，异常：{}", e.getMessage(), e.getClass());
		HashMap<String, String> map = new HashMap<>();
		if (e.hasErrors()) {
			e.getFieldErrors().forEach(item -> map.put(item.getField(), item.getDefaultMessage()));
		}
		return Result.failed(400, "数据校验出错", map);
	}

}