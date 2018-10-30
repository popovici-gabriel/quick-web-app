package com.test.quick.application.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerMockMvcTests {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void envEndpointNotHidden() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andExpect(jsonPath("$.content").value("Hello, World!"));
    }
}
