package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * 订单Dao接口
 *
 * @author Administrator
 */
public interface OrderDao {


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

    /**
     * 查找指定客户的最近的订单
     * n
     */
    Order findLastOrderByCusId(int cusId);
}
