package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerService;

/**
 * 客户服务Dao接口
 *
 * @author Administrator
 */
public interface CustomerServiceDao {

    /**
     * 添加客户服务
     */
    int add(CustomerService customerService);

    /**
     * 查询客户服务
     */
    List<CustomerService> find(Map<String, Object> map);

    /**
     * 查询客户服务记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改客户服务
     */
    int update(CustomerService customerService);
}
