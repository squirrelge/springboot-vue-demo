package com.roypan.platohome;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuotationControllerTests {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    private MockHttpSession session;

    @Before
    public void setupMockMvc(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        session = new MockHttpSession();
    }

    @Test
    public void addQuotation() throws Exception{
        String json = "{\"name\":\"柏拉图\",\"sex\":\"1\",\"date\":\"2018-05-19\",\"country\":\"希腊\",\"quotation\":\"正义是什么？\"}";
        mvc.perform(MockMvcRequestBuilders.post("/quotation/add")
                    .accept(MediaType.APPLICATION_JSON_UTF8)
                    .content(json.getBytes())
                    .header("Content-Type","application/json; charset=utf-8")
        ).andExpect(MockMvcResultMatchers.status().isOk())
         .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void updateQuotation() throws Exception{
        String json = "{\"id\":\"2\",\"name\":\"柏拉图\",\"sex\":\"1\",\"date\":\"2018-05-19\",\"country\":\"希腊\",\"quotation\":\"永恒的理想国\"}";
        mvc.perform(MockMvcRequestBuilders.post("/quotation/update")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json.getBytes())
//                .header("Content-Type","application/json; charset=utf-8")
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void deleteQuotation() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/quotation/delete?id=1")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .header("Content-Type","application/json; charset=utf-8")
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void queryQuotation() throws Exception{
        mvc.perform(MockMvcRequestBuilders.post("/quotation/select")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .header("Content-Type","application/json; charset=utf-8")
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void queryQuotationParams() throws Exception{
        String json = "{\"name\":\"柏拉图\"}";
        mvc.perform(MockMvcRequestBuilders.post("/quotation/selectParams")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(json.getBytes())
                .header("Content-Type","application/json; charset=utf-8")
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
