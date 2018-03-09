package com.ylm.service;

import com.ylm.mapper.DcAdministratorsMapper;
import com.ylm.pojo.DcAdministrators;
import org.springframework.beans.factory.annotation.Autowired;

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
}
