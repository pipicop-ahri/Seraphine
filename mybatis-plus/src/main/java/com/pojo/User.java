package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.enums.FlagDeleteEnum;
import com.enums.GenderType;
import com.enums.SexEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Title: User
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/7 19:47
 * @Version: 1.0
 */
@Data
@TableName("user")
public class User {
	@TableId(value = "id",type = IdType.AUTO)
	private String id;

	private String name;
	private Integer age;
	private SexEnum sex;
}