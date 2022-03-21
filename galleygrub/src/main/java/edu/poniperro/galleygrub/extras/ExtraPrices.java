package edu.poniperro.galleygrub.extras;

public enum ExtraPrices {

    CHEESE(0.25),
    SAUCE(0.50),
    SIZE_LARGE(0.50);

    private final double price;

    private ExtraPrices(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name().toLowerCase();
    }
}
