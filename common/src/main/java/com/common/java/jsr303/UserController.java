package com.common.java.jsr303;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * @Title: UserController
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/8 20:53
 * @Version: 1.0
 */
@RestController
public class UserController {

	// @PostMapping("/add")
	// public Result add(@Valid @RequestBody  BrandEntity brandEntity)  {
	// 	return Result.success("成功");
	// }

	@PostMapping("/add")
	public Result add(@Valid @RequestBody BrandEntity brandEntity)  {
		return Result.success("成功");
	}

	@PostMapping("/update")
	public Result update(@Validated
							 @RequestBody BrandEntity brandEntity)  {
		return Result.success("成功");
	}


}