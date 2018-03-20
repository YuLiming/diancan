package com.ylm.service;

import com.ylm.pojo.DcSysOperateLog;
import com.ylm.pojo.DcSysOperateLogExample;

import java.util.List;

public interface DcSysLogService {

    /**
     *
     * @param example
     * @return
     */
    int countByExample(DcSysOperateLogExample example);

    int deleteByExample(DcSysOperateLogExample example);

    int deleteByPrimaryKey(Integer olId);

    int insert(DcSysOperateLog record);

    List<DcSysOperateLog> selectByExample(DcSysOperateLogExample example);

    DcSysOperateLog selectByPrimaryKey(Integer olId);

    int updateByExample(DcSysOperateLog record, DcSysOperateLogExample example);

    int updateByPrimaryKey(DcSysOperateLog record);
}
