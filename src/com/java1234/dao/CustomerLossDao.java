package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerLoss;

/**
 * 客户流失Dao接口
 *
 * @author Administrator
 */
public interface CustomerLossDao {


    /**
     * 查询客户流失集合
     */
    List<CustomerLoss> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 添加客户流失记录
     */
    int add(CustomerLoss customerLoss);

    /**
     * 通过Id查找实体
     */
    CustomerLoss findById(Integer id);

    /**
     * 修改客户流失记录
     */
    int update(CustomerLoss customerLoss);
}
