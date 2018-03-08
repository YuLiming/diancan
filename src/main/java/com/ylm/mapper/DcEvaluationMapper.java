package com.ylm.mapper;

import com.ylm.pojo.DcEvaluation;
import com.ylm.pojo.DcEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcEvaluationMapper {
    int countByExample(DcEvaluationExample example);

    int deleteByExample(DcEvaluationExample example);

    int deleteByPrimaryKey(Integer evaluationId);

    int insert(DcEvaluation record);

    int insertSelective(DcEvaluation record);

    List<DcEvaluation> selectByExample(DcEvaluationExample example);

    DcEvaluation selectByPrimaryKey(Integer evaluationId);

    int updateByExampleSelective(@Param("record") DcEvaluation record, @Param("example") DcEvaluationExample example);

    int updateByExample(@Param("record") DcEvaluation record, @Param("example") DcEvaluationExample example);

    int updateByPrimaryKeySelective(DcEvaluation record);

    int updateByPrimaryKey(DcEvaluation record);
}