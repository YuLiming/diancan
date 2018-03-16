package com.ylm.mapper;

import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcFoodMapper {
    int countByExample(DcFoodExample example);

    int deleteByExample(DcFoodExample example);

    int deleteByPrimaryKey(Integer foodId);

    int insert(DcFood record);

    int insertSelective(DcFood record);

    List<DcFood> selectByExample(DcFoodExample example);

    DcFood selectByPrimaryKey(Integer foodId);

    int updateByExampleSelective(@Param("record") DcFood record, @Param("example") DcFoodExample example);

    int updateByExample(@Param("record") DcFood record, @Param("example") DcFoodExample example);

    int updateByPrimaryKeySelective(DcFood record);

    int updateByPrimaryKey(DcFood record);

    int deleteByPrimaryKeys(List<Integer> data);
}