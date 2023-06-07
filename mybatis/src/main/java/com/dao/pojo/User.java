package com.dao.pojo;

import com.sun.javafx.image.IntPixelGetter;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private String id;
	private String name;
	private Integer age;
	private Integer sex;
}