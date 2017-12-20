package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.User;

/**
 * 用户Dao接口
 *
 * @author Administrator
 */
public interface UserDao {

    /**
     * 用户登录
     */
    User login(User user);

    /**
     * 查询用户集合
     */
    List<User> find(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改用户
     */
    int update(User user);

    /**
     * 添加用户
     */
    int add(User user);

    /**
     * 删除用户
     */
    int delete(Integer id);
}
