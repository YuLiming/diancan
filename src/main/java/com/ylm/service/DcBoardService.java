package com.ylm.service;

import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcBoardExample;

import java.util.List;

public interface DcBoardService {
    List<DcBoard> selectByExample(DcBoardExample example);
}
