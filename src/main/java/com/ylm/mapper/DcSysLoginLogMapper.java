package com.ylm.mapper;

import com.ylm.pojo.DcSysLoginLog;
import com.ylm.pojo.DcSysLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcSysLoginLogMapper {
    int countByExample(DcSysLoginLogExample example);

    int deleteByExample(DcSysLoginLogExample example);

    int deleteByPrimaryKey(Integer llId);

    int insert(DcSysLoginLog record);

    int insertSelective(DcSysLoginLog record);

    List<DcSysLoginLog> selectByExample(DcSysLoginLogExample example);

    DcSysLoginLog selectByPrimaryKey(Integer llId);

    int updateByExampleSelective(@Param("record") DcSysLoginLog record, @Param("example") DcSysLoginLogExample example);

    int updateByExample(@Param("record") DcSysLoginLog record, @Param("example") DcSysLoginLogExample example);

    int updateByPrimaryKeySelective(DcSysLoginLog record);

    int updateByPrimaryKey(DcSysLoginLog record);
}