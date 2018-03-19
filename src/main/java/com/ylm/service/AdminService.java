package com.ylm.service;

import com.ylm.pojo.DcAdministrators;
import com.ylm.pojo.DcAdministratorsExample;

import java.util.List;

public interface AdminService {

    int login(String account, String password);

    int insert(DcAdministrators record);

    int deleteByPrimaryKey(Integer adminId);

    int updateByPrimaryKey(DcAdministrators record);

    DcAdministrators selectByPrimaryKey(Integer adminId);

    List<DcAdministrators> selectByExample(DcAdministratorsExample example);

    int deleteByPrimaryKeys(List<Integer> data);

    DcAdministrators selectByAccount(String account);

}
