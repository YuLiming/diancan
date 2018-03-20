package com.ylm.service;

import com.ylm.pojo.DcUser;
import com.ylm.pojo.DcUserExample;

import java.util.List;

public interface DcUserService {

    /**
     * 通过id筛选数据
     * @param userId
     * @return
     */
    DcUser selectByPrimaryKey(String userId);

    /**
     * 获取所有数据
     * @param example
     * @return
     */
    List<DcUser> selectByExample(DcUserExample example);

    /**
     * 更新数据
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcUser record);

    /**
     * 删除数据
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(String userId);

    /**
     * 新增数据
     * @param record
     * @return
     */
    int insert(DcUser record);

    /**
     * 删除数据
     * @param userId
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> userId);
}
