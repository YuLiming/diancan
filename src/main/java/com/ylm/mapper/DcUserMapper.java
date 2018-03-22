package com.ylm.mapper;

import java.util.List;

import com.ylm.pojo.DcUser;
import com.ylm.pojo.DcUserExample;
import org.apache.ibatis.annotations.Param;

public interface DcUserMapper {
    int countByExample(DcUserExample example);

    int deleteByExample(DcUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(DcUser record);

    int insertSelective(DcUser record);

    List<DcUser> selectByExample(DcUserExample example);

    DcUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") DcUser record, @Param("example") DcUserExample example);

    int updateByExample(@Param("record") DcUser record, @Param("example") DcUserExample example);

    int updateByPrimaryKeySelective(DcUser record);

    int updateByPrimaryKey(DcUser record);

    int deleteByPrimaryKeys(List<String> userId);
}