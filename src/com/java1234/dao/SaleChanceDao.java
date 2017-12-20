package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.SaleChance;

/**
 * 销售机会Dao接口
 *
 * @author Administrator
 */
public interface SaleChanceDao {


    /**
     * 查询销售机会集合
     */
    List<SaleChance> find(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 添加销售机会
     */
    int add(SaleChance saleChance);

    /**
     * 修改销售机会
     */
    int update(SaleChance saleChance);

    /**
     * 删除销售机会
     */
    int delete(Integer id);

    /**
     * 根据id查找实体
     */
    SaleChance findById(Integer id);
}
