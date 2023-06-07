package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: UserMapper
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/6/7 19:43
 * @Version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}