package com.keng.boot.learning.web.controller;

import com.keng.boot.learning.web.SpringBootMockMvcIntegrationTest;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class HealthControllerTest extends SpringBootMockMvcIntegrationTest {

    @Test
    public void healthTest() throws Exception {
        MvcResult ok = mockMvc.perform(MockMvcRequestBuilders.get("/japi/health"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("ok"))
                .andReturn();
        System.out.println(ok.getResponse().getContentAsString());
    }

}
