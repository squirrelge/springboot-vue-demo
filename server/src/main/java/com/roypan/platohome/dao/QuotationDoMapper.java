package com.roypan.platohome.dao;

import com.roypan.platohome.model.QuotationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuotationDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuotationDo record);

    int insertSelective(QuotationDo record);

    QuotationDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuotationDo record);

    int updateByPrimaryKey(QuotationDo record);

    List<QuotationDo> selectByPage(String query);
}