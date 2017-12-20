package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * 数据字典Dao接口
 *
 * @author Administrator
 */
public interface DataDicDao {


    /**
     * 查询数据字典集合
     */
    List<DataDic> find(Map<String, Object> map);

    /**
     * 查询所有的数据字典名称集合
     */
    List<DataDic> findAll();

    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改数据字典
     */
    int update(DataDic dataDic);

    /**
     * 添加数据字典
     */
    int add(DataDic dataDic);

    /**
     * 删除数据字典
     */
    int delete(Integer id);

}
