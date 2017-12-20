package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CusDevPlan;

/**
 * 客户开发计划Dao接口
 *
 * @author Administrator
 */
public interface CusDevPlanDao {


    /**
     * 查询客户开发计划集合
     */
    List<CusDevPlan> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改客户开发计划
     */
    int update(CusDevPlan cusDevPlan);

    /**
     * 添加客户开发计划
     */
    int add(CusDevPlan cusDevPlan);

    /**
     * 删除客户开发计划
     */
    int delete(Integer id);

}
