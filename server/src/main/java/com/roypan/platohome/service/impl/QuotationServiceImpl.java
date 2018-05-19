package com.roypan.platohome.service.impl;

import com.github.pagehelper.PageHelper;
import com.roypan.platohome.dao.QuotationDoMapper;
import com.roypan.platohome.model.QuotationDo;
import com.roypan.platohome.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author:panguangyi
 * @date: 2018-5-18
 */
@Service("QuotationService")
public class QuotationServiceImpl implements QuotationService{
    @Autowired
    private QuotationDoMapper quotationDoMapper;

    @Override
    public int addQuotation(QuotationDo quotationDo) {
        return quotationDoMapper.insert(quotationDo);
    }

    @Override
    public int updateQuotation(QuotationDo quotationDo) {
        return quotationDoMapper.updateByPrimaryKeySelective(quotationDo);
    }

    @Override
    public int deleteQuotation(int id) {
        return quotationDoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<QuotationDo> findQuotations(int pageNum, int pageSize,QuotationDo quotationDo) {
        PageHelper.startPage(pageNum,pageSize);
        return quotationDoMapper.selectByPage(quotationDo);
    }

    @Override
    public QuotationDo findQuotationById(int id) {
        return quotationDoMapper.selectByPrimaryKey(id);
    }
}
