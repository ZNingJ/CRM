package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * 订单Service接口
 *
 * @author Administrator
 */
public interface OrderService {

    /**
     * 查询订单集合
     */
    List<Order> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 通过Id查找实体
     */
    Order findById(Integer id);
}
