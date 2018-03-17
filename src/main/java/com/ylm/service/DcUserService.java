package com.ylm.service;

import com.ylm.pojo.DcUser;
import com.ylm.pojo.DcUserExample;

import java.util.List;

public interface DcUserService {

    DcUser selectByPrimaryKey(String userId);

    List<DcUser> selectByExample(DcUserExample example);

    int updateByPrimaryKey(DcUser record);

    int deleteByPrimaryKey(String userId);

    int insert(DcUser record);

    int deleteByPrimaryKeys(List<Integer> userId);
}
