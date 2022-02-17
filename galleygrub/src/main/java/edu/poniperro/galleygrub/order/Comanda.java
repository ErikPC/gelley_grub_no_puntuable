package edu.poniperro.galleygrub.order;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public interface Comanda {

    public void addItem(String nombre, double precio);

    public void addItem(String nombre, double precio, String nombreExtra);

    public int size();

    public List<Item> intemList();

    public Double getTotal();

    public void updateTotal(Double precio);

    public void display();
}
