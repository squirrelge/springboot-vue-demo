package com.roypan.platohome.service;

import com.roypan.platohome.model.QuotationDo;

import java.util.List;

/**
 * @description:
 * @author:panguangyi
 * @date: 2018-5-18
 */
public interface QuotationService {
    public int addQuotation(QuotationDo quotationDo);

    public int updateQuotation(QuotationDo quotationDo);

    public int deleteQuotation(int id);

    public List<QuotationDo> findQuotations(int pageNum,int pageSize,QuotationDo quotationDo);

    public QuotationDo findQuotationById(int id);
}
