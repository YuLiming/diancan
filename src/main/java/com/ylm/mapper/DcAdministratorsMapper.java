package com.ylm.mapper;

import com.ylm.pojo.DcAdministrators;
import com.ylm.pojo.DcAdministratorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcAdministratorsMapper {
    int countByExample(DcAdministratorsExample example);

    int deleteByExample(DcAdministratorsExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(DcAdministrators record);

    int insertSelective(DcAdministrators record);

    List<DcAdministrators> selectByExample(DcAdministratorsExample example);

    DcAdministrators selectByPrimaryKey(Integer adminId);

    DcAdministrators selectUserByNameAndPwd(@Param("account") String account,@Param("password") String password);

    int updateByExampleSelective(@Param("record") DcAdministrators record, @Param("example") DcAdministratorsExample example);

    int updateByExample(@Param("record") DcAdministrators record, @Param("example") DcAdministratorsExample example);

    int updateByPrimaryKeySelective(DcAdministrators record);

    int updateByPrimaryKey(DcAdministrators record);

    int deleteByPrimaryKeys(List<Integer> data);
}