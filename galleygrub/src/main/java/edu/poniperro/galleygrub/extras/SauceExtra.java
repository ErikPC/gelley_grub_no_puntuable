package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extras {

    public SauceExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == ExtraPrices.SAUCE.getName()).count();

        Double priceSauce = total * ExtraPrices.SAUCE.getPrice();
        comanda.updateTotal(priceSauce);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
