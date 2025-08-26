package com.example.custom_rest_api;


import com.example.custom_rest_api.data.PizzaRepository;
import com.example.custom_rest_api.data.PizzaResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.custom_rest_api.models.Pizza;

import java.util.Collection;


@RestController
public class MainRestController {

    private PizzaRepository pizzaRepository = new PizzaRepository();

    @GetMapping("/test")
    public String getTest() {
        return "OK";
    }

    @GetMapping("/pizzas")
      public Collection<PizzaResponse> getPizza(){
        var pizzas = pizzaRepository.getAll();
        return PizzaResponse.fromHashMap(pizzas);
    }

    @GetMapping("/pizzas/{id}")
    public PizzaResponse getPizza(@PathVariable int id){
        try {
            var pizza = pizzaRepository.get(id);
            return new PizzaResponse(id, pizza);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
