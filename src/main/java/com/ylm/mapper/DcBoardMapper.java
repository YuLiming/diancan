package com.ylm.mapper;

import com.ylm.pojo.DcBoard;
import com.ylm.pojo.DcBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcBoardMapper {
    int countByExample(DcBoardExample example);

    int deleteByExample(DcBoardExample example);

    int deleteByPrimaryKey(Integer boardId);

    int insert(DcBoard record);

    int insertSelective(DcBoard record);

    List<DcBoard> selectByExample(DcBoardExample example);

    DcBoard selectByPrimaryKey(Integer boardId);

    int updateByExampleSelective(@Param("record") DcBoard record, @Param("example") DcBoardExample example);

    int updateByExample(@Param("record") DcBoard record, @Param("example") DcBoardExample example);

    int updateByPrimaryKeySelective(DcBoard record);

    int updateByPrimaryKey(DcBoard record);

    int deleteByPrimaryKeys(List<Integer> data);
}