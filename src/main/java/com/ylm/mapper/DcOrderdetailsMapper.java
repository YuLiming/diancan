package com.ylm.mapper;

import com.ylm.pojo.DcOrderdetails;
import com.ylm.pojo.DcOrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcOrderdetailsMapper {
    int countByExample(DcOrderdetailsExample example);

    int deleteByExample(DcOrderdetailsExample example);

    int deleteByPrimaryKey(Integer orderdetailsId);

    int insert(DcOrderdetails record);

    int insertSelective(DcOrderdetails record);

    List<DcOrderdetails> selectByExample(DcOrderdetailsExample example);

    DcOrderdetails selectByPrimaryKey(Integer orderdetailsId);

    int updateByExampleSelective(@Param("record") DcOrderdetails record, @Param("example") DcOrderdetailsExample example);

    int updateByExample(@Param("record") DcOrderdetails record, @Param("example") DcOrderdetailsExample example);

    int updateByPrimaryKeySelective(DcOrderdetails record);

    int updateByPrimaryKey(DcOrderdetails record);
}