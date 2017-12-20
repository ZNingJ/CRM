package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.OrderDetails;

/**
 * 订单明细Service接口
 *
 * @author Administrator
 */
public interface OrderDetailsService {


    /**
     * 查询订单明细集合
     */
    List<OrderDetails> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 获取指定订单的总金额
     */
    float getTotalPriceByOrderId(Integer orderId);


}
