package com.ylm.service;

import com.ylm.pojo.DcSysOperateLog;
import com.ylm.pojo.DcSysOperateLogExample;

import java.util.List;

public interface DcSysLogService {

    /**
     * 获取数据数量
     * @param example
     * @return
     */
    int countByExample(DcSysOperateLogExample example);

    /**
     * 删除数据
     * @param example
     * @return
     */
    int deleteByExample(DcSysOperateLogExample example);

    /**
     * 根据id删除数据
     * @param olId
     * @return
     */
    int deleteByPrimaryKey(Integer olId);

    /**
     * 新增数据
     * @param record
     * @return
     */
    int insert(DcSysOperateLog record);

    /**
     * 获取所有数据
     * @param example
     * @return
     */
    List<DcSysOperateLog> selectByExample(DcSysOperateLogExample example);

    /**
     * 通过id筛选数据
     * @param olId
     * @return
     */
    DcSysOperateLog selectByPrimaryKey(Integer olId);

    /**
     * 更新数据
     * @param record
     * @param example
     * @return
     */
    int updateByExample(DcSysOperateLog record, DcSysOperateLogExample example);

    /**
     * 更新数据
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcSysOperateLog record);
}
