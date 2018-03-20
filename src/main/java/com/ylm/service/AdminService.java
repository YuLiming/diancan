package com.ylm.service;

import com.ylm.pojo.DcAdministrators;
import com.ylm.pojo.DcAdministratorsExample;

import java.util.List;

public interface AdminService {

    /**
     * 根据账号和密码进行登陆验证
     * @param account
     * @param password
     * @return
     */
    int login(String account, String password);

    /**
     * 新增管理员
     * @param record
     * @return
     */
    int insert(DcAdministrators record);

    /**
     * 根据Id删除管理员
     * @param adminId
     * @return
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * 更新管理员信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcAdministrators record);

    /**
     * 根据Id获取管理员信息
     * @param adminId
     * @return
     */
    DcAdministrators selectByPrimaryKey(Integer adminId);

    /**
     * 获取所有管理员信息
     * @param example
     * @return
     */
    List<DcAdministrators> selectByExample(DcAdministratorsExample example);

    /**
     * 根据id批量删除管理员
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);

    /**
     * 根据账号获取管理员信息
     * @param account
     * @return
     */
    DcAdministrators selectByAccount(String account);

}
