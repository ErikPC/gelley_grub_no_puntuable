package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extras {

    private Double SAUCE_PRICE = 0.50;

    public SauceExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == SAUCE).count();

        Double priceSauce = total * SAUCE_PRICE;
        comanda.updateTotal(priceSauce);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
