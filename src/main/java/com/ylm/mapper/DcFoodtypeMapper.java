package com.ylm.mapper;

import com.ylm.pojo.DcFoodtype;
import com.ylm.pojo.DcFoodtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcFoodtypeMapper {
    int countByExample(DcFoodtypeExample example);

    int deleteByExample(DcFoodtypeExample example);

    int deleteByPrimaryKey(Integer foodtypeId);

    int insert(DcFoodtype record);

    int insertSelective(DcFoodtype record);

    List<DcFoodtype> selectByExample(DcFoodtypeExample example);

    DcFoodtype selectByPrimaryKey(Integer foodtypeId);

    int updateByExampleSelective(@Param("record") DcFoodtype record, @Param("example") DcFoodtypeExample example);

    int updateByExample(@Param("record") DcFoodtype record, @Param("example") DcFoodtypeExample example);

    int updateByPrimaryKeySelective(DcFoodtype record);

    int updateByPrimaryKey(DcFoodtype record);
}