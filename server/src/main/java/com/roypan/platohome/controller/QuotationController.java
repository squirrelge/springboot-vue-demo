package com.roypan.platohome.controller;

import com.github.pagehelper.PageHelper;
import com.roypan.platohome.model.QuotationDo;
import com.roypan.platohome.model.common.PageRequestDo;
import com.roypan.platohome.model.common.PageResponseDo;
import com.roypan.platohome.model.common.ResponseDo;
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
    @PostMapping(value = "/save")
    public ResponseDo saveQuotation(@RequestBody QuotationDo quotationDo){
        if(quotationDo.getId() != null){
            return new ResponseDo(true,"操作成功",quotationService.updateQuotation(quotationDo));
        }
        return new ResponseDo(true,"操作成功",quotationService.addQuotation(quotationDo));
    }

//    @ResponseBody
//    @PostMapping(value = "/add")
//    public int addQuotation(@RequestBody QuotationDo quotationDo){
//        return quotationService.addQuotation(quotationDo);
//    }
//
//    @ResponseBody
//    @PostMapping(value = "/update")
//    public int updateQuotation(@RequestBody QuotationDo quotationDo){
//        return quotationService.updateQuotation(quotationDo);
//    }

    @ResponseBody
    @GetMapping(value = "/delete")
    public ResponseDo deleteQuotation(@RequestParam(name = "id") int id){
        return new ResponseDo(true,"操作成功",quotationService.deleteQuotation(id));
    }

    @ResponseBody
    @PostMapping(value = "/select")
    public PageResponseDo findQuotationsParams(@RequestBody PageRequestDo requestDo){
        PageHelper.startPage(requestDo.getPage(),requestDo.getSize());
        List<QuotationDo> list = quotationService.findQuotations(requestDo.getPage(),requestDo.getSize(),requestDo.getQuery());
        return new PageResponseDo(true,"操作成功",list.size(),list);
    }

//    @ResponseBody
//    @PostMapping(value = "/select")
//    public PageResponseDo findQuotations(@RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,
//                                            @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        List<QuotationDo> list = quotationService.findQuotations(pageNum,pageSize,null);
//        return new PageResponseDo(true,"操作成功",list.size(),list);
//    }

    @ResponseBody
    @PostMapping(value = "/selectId")
    public ResponseDo findQuotationById(@RequestParam(name = "id") int id){
        return new ResponseDo(true,"操作成功",quotationService.findQuotationById(id));
    }
}
