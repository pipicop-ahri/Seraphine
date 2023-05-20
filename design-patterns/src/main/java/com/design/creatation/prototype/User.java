package com.design.creatation.prototype;


import lombok.Data;

/**
 * @Title: User
 * @Description: 用户实体
 * @Author: yj
 * @Date: 2023/5/13 14:09
 * @Version: 1.0
 */
@Data
public class User implements Cloneable{
    private String name;
    private Integer age;

    public User() {
        System.out.println("User构建执行");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.getName());
        user.setAge(this.getAge());
        return user;
    }
}