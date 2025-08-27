package com.example.custom_rest_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MainRestController.class)
public class MainRestControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetTest() throws Exception {
        mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }

    @Test
    public void testGetPizzas() throws Exception {
        mockMvc.perform(get("/pizzas"))
                .andExpect(status().isOk())
                // verify JSON array returned
                .andExpect(jsonPath("$").isArray())
                // verify at least one pizza is there
                .andExpect(jsonPath("$.length()").value(26))
                // verify that the first pizza has correct name
                .andExpect(jsonPath("$[0].name").value("Margherita"))
                .andExpect(jsonPath("$[0].price").value(80));
    }

    @Test
    public void testGetPizzaById() throws Exception {
        mockMvc.perform(get("/pizzas/5"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Vegetarian"))
                .andExpect(jsonPath("$.description").value("Loaded with fresh vegetables"))
                .andExpect(jsonPath("$.price").value(90));
    }
}
