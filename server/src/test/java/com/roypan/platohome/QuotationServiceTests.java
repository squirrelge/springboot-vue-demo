package com.roypan.platohome;

import com.roypan.platohome.model.QuotationDo;
import com.roypan.platohome.service.QuotationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuotationServiceTests {
    @Autowired
    private QuotationService quotationService;

    @Test
    public void queryQuotations(){
        List<QuotationDo> list = quotationService.findQuotations(1,10,null);
        Assert.assertThat(list.size(),is(1));
    }
}
