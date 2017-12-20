package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * 产品Dao接口
 *
 * @author Administrator
 */
public interface ProductDao {


    /**
     * 查询产品集合
     */
    List<Product> find(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

}
