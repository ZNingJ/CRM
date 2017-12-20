package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * 产品Service接口
 *
 * @author Administrator
 */
public interface ProductService {

    /**
     * 查询产品集合
     */
    List<Product> find(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);
}
