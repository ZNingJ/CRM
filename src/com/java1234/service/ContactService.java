package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Contact;

/**
 * 交往记录Service接口
 *
 * @author Administrator
 */
public interface ContactService {


    /**
     * 查询交往记录集合
     */
    List<Contact> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改交往记录
     */
    int update(Contact contact);

    /**
     * 添加交往记录
     */
    int add(Contact contact);

    /**
     * 删除交往记录
     */
    int delete(Integer id);

}
