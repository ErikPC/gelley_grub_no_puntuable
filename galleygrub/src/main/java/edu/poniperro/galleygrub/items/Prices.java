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
                        "cheese", 0.25,
                        "sauce", 0.50,
                        "medium", 0.25,
                        "large", 0.50));

    }

    public static Map<String, Double> getItems() {
        return items;
    }

    public static Double priceOf(String extra) {
        return items.get(extra);
    }

    public static void display() {
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println("\t" + entry);
        }
    }

}
