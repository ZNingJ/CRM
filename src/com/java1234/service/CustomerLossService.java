package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerLoss;

/**
 * 客户流失Service接口
 *
 * @author Administrator
 */
public interface CustomerLossService {

    /**
     * 查询客户流失集合
     */
    List<CustomerLoss> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 通过Id查找实体
     */
    CustomerLoss findById(Integer id);

    /**
     * 修改客户流失记录
     */
    int update(CustomerLoss customerLoss);
}
