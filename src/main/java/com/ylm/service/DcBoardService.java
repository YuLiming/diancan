package com.ylm.service;

import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcBoardExample;

import java.util.List;

public interface DcBoardService {
    List<DcBoard> selectByExample(DcBoardExample example);

    DcBoard selectByPrimaryKey(Integer boardId);

    /**
     * 更新餐桌信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcBoard record);

    /**
     * 根据id删除餐桌
     * @param boardId
     * @return
     */
    int deleteByPrimaryKey(Integer boardId);

    /**
     * 新增餐桌
     * @param record
     * @return
     */
    int insert(DcBoard record);

    /**
     * 批量删除餐桌
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);
}
