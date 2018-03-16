package com.ylm.service;

import com.ylm.mapper.DcAdministratorsMapper;
import com.ylm.pojo.DcAdministrators;
import com.ylm.pojo.DcAdministratorsExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    public static final int LOGIN_SUCCESS = 1;
    public static final int LOGIN_FAILURE = -1;

    @Autowired
    DcAdministratorsMapper administratorsMapper;

    @Override
    public int login(String account, String password) {
        System.out.print(account+password);
        DcAdministrators administrators = administratorsMapper.selectUserByNameAndPwd(account,password);
        if (administrators == null){
            return LOGIN_FAILURE;
        }else {
            return LOGIN_SUCCESS;
        }
    }

    @Override
    public int insert(DcAdministrators record) {
        return administratorsMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return administratorsMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public int updateByPrimaryKey(DcAdministrators record) {
        return administratorsMapper.updateByPrimaryKey(record);
    }

    @Override
    public DcAdministrators selectByPrimaryKey(Integer adminId) {
        return administratorsMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public List<DcAdministrators> selectByExample(DcAdministratorsExample example) {
        return administratorsMapper.selectByExample(example);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return administratorsMapper.deleteByPrimaryKeys(data);
    }
}
