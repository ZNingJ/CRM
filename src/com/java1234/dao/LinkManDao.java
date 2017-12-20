package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.LinkMan;

/**
 * 联系人Dao接口
 *
 * @author Administrator
 */
public interface LinkManDao {


    /**
     * 查询联系人集合
     */
    List<LinkMan> find(Map<String, Object> map);


    /**
     * 获取总记录数
     */
    Long getTotal(Map<String, Object> map);

    /**
     * 修改联系人
     */
    int update(LinkMan linkMan);

    /**
     * 添加联系人
     */
    int add(LinkMan linkMan);

    /**
     * 删除联系人
     */
    int delete(Integer id);

}
