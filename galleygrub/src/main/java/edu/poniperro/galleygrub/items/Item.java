package edu.poniperro.galleygrub.items;

public class Item implements Product {

    String name;
    Double price;
    String extra;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    public String extra() {
        return this.extra;
    }

    public Boolean isRegular() {
        if (extra() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return extra() == null ? name() + "...." + String.format("%.2f", price()) + "$"
                : name() + " w/ " + extra() + "...." + String.format("%.2f", price()) + "$" + " + " +
                        String.format("%.2f", Prices.priceOf(extra())) + "$";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return this.name.equals(((Item) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
