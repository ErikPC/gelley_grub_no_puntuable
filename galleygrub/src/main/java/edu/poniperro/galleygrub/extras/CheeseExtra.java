package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extras {

    private Double CHEESE_PRICE = 0.25;

    public CheeseExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == CHEESE).count();

        Double priceCheese = total * CHEESE_PRICE;
        comanda.updateTotal(priceCheese);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
