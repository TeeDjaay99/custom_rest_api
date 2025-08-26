package com.example.custom_rest_api.data;

import com.example.custom_rest_api.models.Pizza;

import java.util.HashMap;

public class PizzaRepository {
    private HashMap<Integer, Pizza> pizzaMap = new HashMap<>();

    public PizzaRepository(){
        pizzaMap.put(1, new Pizza("Margherita", "A cheese pizza", 80));
        pizzaMap.put(2, new Pizza("Pepperoni", "Classic pepperoni and cheese", 95));
        pizzaMap.put(3, new Pizza("Hawaiian", "Ham and pineapple", 100));
        pizzaMap.put(4, new Pizza("Quattro Formaggi", "Four cheese pizza", 110));
        pizzaMap.put(5, new Pizza("Vegetarian", "Loaded with fresh vegetables", 90));
        pizzaMap.put(6, new Pizza("BBQ Chicken", "Chicken, BBQ sauce, and red onions", 115));
        pizzaMap.put(7, new Pizza("Meat Lovers", "Pepperoni, ham, beef, sausage, bacon", 120));
        pizzaMap.put(8, new Pizza("Capricciosa", "Ham, mushrooms, artichokes, olives", 105));
        pizzaMap.put(9, new Pizza("Frutti di Mare", "Seafood pizza with shrimp and mussels", 125));
        pizzaMap.put(10, new Pizza("Diavola", "Spicy salami and chili flakes", 110));
        pizzaMap.put(11, new Pizza("Prosciutto e Funghi", "Ham and mushrooms", 100));
        pizzaMap.put(12, new Pizza("Buffalo Chicken", "Spicy buffalo sauce and chicken", 115));
        pizzaMap.put(13, new Pizza("Truffle Mushroom", "Mushrooms with truffle oil", 130));
        pizzaMap.put(14, new Pizza("Carbonara", "Bacon, egg, parmesan cream base", 120));
        pizzaMap.put(15, new Pizza("Mediterranean", "Feta, olives, sun-dried tomatoes", 110));
        pizzaMap.put(16, new Pizza("Pesto Chicken", "Chicken with pesto and mozzarella", 115));
        pizzaMap.put(17, new Pizza("Tandoori Chicken", "Indian-inspired spiced chicken", 125));
        pizzaMap.put(18, new Pizza("Tex Mex", "Ground beef, jalapeños, cheddar", 115));
        pizzaMap.put(19, new Pizza("Calzone", "Folded pizza with ham, cheese, tomato", 105));
        pizzaMap.put(20, new Pizza("Vegan Delight", "Vegan cheese and roasted veggies", 95));
        pizzaMap.put(21, new Pizza("White Pizza", "Ricotta, garlic, and mozzarella", 100));
        pizzaMap.put(22, new Pizza("Sicilian", "Thick crust, tomato, anchovies, oregano", 110));
        pizzaMap.put(23, new Pizza("Cheeseburger Pizza", "Beef, pickles, ketchup, cheese", 120));
        pizzaMap.put(24, new Pizza("Philly Steak", "Steak strips, onions, peppers", 125));
        pizzaMap.put(25, new Pizza("Breakfast Pizza", "Egg, bacon, sausage, cheese", 115));
        pizzaMap.put(26, new Pizza("Greek", "Feta, olives, red onion, spinach", 110));
    }

    public HashMap<Integer, Pizza> getAll() {
        return pizzaMap;
    }

    public Pizza get(int id) throws Exception {
        var idExists = pizzaMap.containsKey(id);

        if(!idExists){
            throw new Exception("Invalid ID");
        }

        return pizzaMap.get(id);
    }
}
