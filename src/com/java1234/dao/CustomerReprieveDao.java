package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerReprieve;

/**
 * 客户流失暂缓措施Dao接口
 *
 * @author Administrator
 */
public interface CustomerReprieveDao {


    /**
     * 查询客户流失暂缓措施集合
     */
    List<CustomerReprieve> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改客户流失暂缓措施
     */
    int update(CustomerReprieve customerReprieve);

    /**
     * 添加客户流失暂缓措施
     */
    int add(CustomerReprieve customerReprieve);

    /**
     * 删除客户流失暂缓措施
     */
    int delete(Integer id);

}
