package com.design.creatation.prototype;


import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: GuiguMybatis
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/5/13 14:49
 * @Version: 1.0
 */
public class GuiguMybatis {

    public Map<String,User> userCache = new HashMap<>();


    User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        // 先查缓存
        if (!userCache.containsKey(username)) {
            // 无缓存再从数据库中查
            return getUserByDB(username);
        }else{
            // 有从缓存中取
            user = userCache.get(username);
            return (User)user.clone();
        }
    }

    @SneakyThrows
    private User getUserByDB(String username) {
        System.out.println("查询数据库获取到用户" + username);
        User user = new User();
        user.setName(username);
        user.setAge(18);
        userCache.put(username, (User)user.clone());
        return user;
    }
}