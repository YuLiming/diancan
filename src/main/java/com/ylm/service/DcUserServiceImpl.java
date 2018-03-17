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
    public DcUser selectByPrimaryKey(String userId) {
        return dcUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<DcUser> selectByExample(DcUserExample example) {
        return dcUserMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKey(DcUser record) {
        if (record.getUserId()==null||record.getUserId().isEmpty()){
            return -9;
        }
        return dcUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(String userId) {
        return dcUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(DcUser record) {
        return dcUserMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> userId) {
        return dcUserMapper.deleteByPrimaryKeys(userId);
    }


}
