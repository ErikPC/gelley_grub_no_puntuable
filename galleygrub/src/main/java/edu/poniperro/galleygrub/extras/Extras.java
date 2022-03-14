package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public abstract class Extras {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct;
    Optional<Extras> nextExtra = Optional.empty();

    public Extras() {
    };

    public void setNextExtra(Extras extra) {
        this.nextExtra = Optional.of(extra);
    }

    public abstract void sumExtras(Comanda comanda);
}
