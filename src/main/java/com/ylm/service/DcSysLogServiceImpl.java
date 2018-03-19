package com.ylm.service;

import com.ylm.mapper.DcSysOperateLogMapper;
import com.ylm.pojo.DcSysOperateLog;
import com.ylm.pojo.DcSysOperateLogExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcSysLogServiceImpl implements DcSysLogService {

    @Autowired
    DcSysOperateLogMapper dcSysOperateLogMapper;

    @Override
    public int countByExample(DcSysOperateLogExample example) {
        return dcSysOperateLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DcSysOperateLogExample example) {
        return dcSysOperateLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer olId) {
        return dcSysOperateLogMapper.deleteByPrimaryKey(olId);
    }

    @Override
    public int insert(DcSysOperateLog record) {
        return dcSysOperateLogMapper.insert(record);
    }


    @Override
    public List<DcSysOperateLog> selectByExample(DcSysOperateLogExample example) {
        return dcSysOperateLogMapper.selectByExample(example);
    }

    @Override
    public DcSysOperateLog selectByPrimaryKey(Integer olId) {
        return dcSysOperateLogMapper.selectByPrimaryKey(olId);
    }


    @Override
    public int updateByExample(DcSysOperateLog record, DcSysOperateLogExample example) {
        return dcSysOperateLogMapper.updateByExample(record,example);
    }


    @Override
    public int updateByPrimaryKey(DcSysOperateLog record) {
        return dcSysOperateLogMapper.updateByPrimaryKey(record);
    }
}
