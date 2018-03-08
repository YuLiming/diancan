package com.ylm.service;

import com.ylm.mapper.DcUserMapper;
import com.ylm.pojo.DcUser;
import com.ylm.pojo.DcUserExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcUserServiceImpl implements DcUserService {

    @Autowired
    DcUserMapper dcUserMapper;

    @Override
    public List<DcUser> selectByExample(DcUserExample example) {
        return dcUserMapper.selectByExample(example);
    }
}
