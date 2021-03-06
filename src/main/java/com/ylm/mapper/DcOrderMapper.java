package com.ylm.mapper;

import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcOrderMapper {
    int countByExample(DcOrderExample example);

    int deleteByExample(DcOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(DcOrder record);

    int insertSelective(DcOrder record);

    List<DcOrder> selectByExample(DcOrderExample example);

    DcOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") DcOrder record, @Param("example") DcOrderExample example);

    int updateByExample(@Param("record") DcOrder record, @Param("example") DcOrderExample example);

    int updateByPrimaryKeySelective(DcOrder record);

    int updateByPrimaryKey(DcOrder record);
}