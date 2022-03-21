package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extras {

    public CheeseExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == ExtraPrices.CHEESE.getName()).count();

        Double priceCheese = total * ExtraPrices.CHEESE.getPrice();
        comanda.updateTotal(priceCheese);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
