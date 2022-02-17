package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static Map<String, Double> items;

    public Prices() {
    }

    public static void init_prices() {
        items = new HashMap<String, Double>(
                Map.of(
                        "Krabby Patty", 1.25,
                        "Coral Bits", 1.00,
                        "Kelp Rings", 1.50,
                        "Golden Loaf", 2.00,
                        "Seafoam Soda", 1.00,
                        "cheese", 0.25,
                        "sauce", 0.50,
                        "medium", 0.25,
                        "large", 0.50));

    }

    public static void display() {
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry);
        }
    }

}
