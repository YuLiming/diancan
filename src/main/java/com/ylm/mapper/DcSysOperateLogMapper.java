package com.ylm.mapper;

import com.ylm.pojo.DcSysOperateLog;
import com.ylm.pojo.DcSysOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcSysOperateLogMapper {
    int countByExample(DcSysOperateLogExample example);

    int deleteByExample(DcSysOperateLogExample example);

    int deleteByPrimaryKey(Integer olId);

    int insert(DcSysOperateLog record);

    int insertSelective(DcSysOperateLog record);

    List<DcSysOperateLog> selectByExample(DcSysOperateLogExample example);

    DcSysOperateLog selectByPrimaryKey(Integer olId);

    int updateByExampleSelective(@Param("record") DcSysOperateLog record, @Param("example") DcSysOperateLogExample example);

    int updateByExample(@Param("record") DcSysOperateLog record, @Param("example") DcSysOperateLogExample example);

    int updateByPrimaryKeySelective(DcSysOperateLog record);

    int updateByPrimaryKey(DcSysOperateLog record);
}