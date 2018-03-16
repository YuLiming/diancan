package com.ylm.service;

import com.ylm.mapper.DcBoardMapper;
import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcBoardExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcBoardServiceImpl implements DcBoardService {

    @Autowired
    DcBoardMapper dcBoardMapper;

    @Override
    public List<DcBoard> selectByExample(DcBoardExample example) {
        return dcBoardMapper.selectByExample(example);
    }

    @Override
    public DcBoard selectByPrimaryKey(Integer boardId) {
        return dcBoardMapper.selectByPrimaryKey(boardId);
    }

    @Override
    public int updateByPrimaryKey(DcBoard record) {
        return dcBoardMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer boardId) {
        return dcBoardMapper.deleteByPrimaryKey(boardId);
    }

    @Override
    public int insert(DcBoard record) {
        return dcBoardMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return dcBoardMapper.deleteByPrimaryKeys(data);
    }
}
