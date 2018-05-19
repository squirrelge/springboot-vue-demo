package com.roypan.platohome.dao;

import com.roypan.platohome.model.QuotationDo;

import java.util.List;

public interface QuotationDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuotationDo record);

    int insertSelective(QuotationDo record);

    QuotationDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuotationDo record);

    int updateByPrimaryKey(QuotationDo record);

    List<QuotationDo> selectByPage(QuotationDo record);
}