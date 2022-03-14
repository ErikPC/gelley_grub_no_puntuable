package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;
import edu.poniperro.galleygrub.items.Item;

public class Order implements Comanda {
    private Double total;
    private List<Item> items = new ArrayList<Item>();

    public Order() {
    }

    @Override
    public void addItem(String nombre, double precio) {
        items.add(new Item(nombre, precio));

    }

    @Override
    public void addItem(String nombre, double precio, String nombreExtra) {
        items.add(new Item(nombre, precio, nombreExtra));

    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> intemList() {
        return this.items;
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double precio) {
        this.total += precio;
    }

    @Override
    public void display() {

        System.out.println("\n \t--- ORDER ---");
        for (int i = 0; i < size(); i++) {
            Item item = items.get(i);
            System.out.println("\t" + item.name() + "...." + String.format("%.2f", item.price()) + "$");
        }

    }

}
