package com.roypan.platohome.controller;

import com.github.pagehelper.PageHelper;
import com.roypan.platohome.model.QuotationDo;
import com.roypan.platohome.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author:panguangyi
 * @date: 2018-5-18
 */
@RestController
@RequestMapping(value = "/quotation")
public class QuotationController {
    @Autowired
    private QuotationService quotationService;

    @ResponseBody
    @PostMapping(value = "/add")
    public int addQuatation(@RequestBody QuotationDo quotationDo){
        return quotationService.addQuotation(quotationDo);
    }

    @ResponseBody
    @PostMapping(value = "/update")
    public int updateQuotation(@RequestBody QuotationDo quotationDo){
        return quotationService.updateQuotation(quotationDo);
    }

    @ResponseBody
    @GetMapping(value = "/delete")
    public int deleteQuotation(@RequestParam(name = "id") int id){
        return quotationService.deleteQuotation(id);
    }

    @ResponseBody
    @PostMapping(value = "/select")
    public List<QuotationDo> findQuotations(@RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,
                                            @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize,
                                            @RequestBody QuotationDo quotationDo){
        PageHelper.startPage(pageNum,pageSize);
        return quotationService.findQuotations(pageNum,pageSize,quotationDo);
    }
}
