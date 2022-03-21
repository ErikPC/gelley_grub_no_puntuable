package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extras {

    public SizeLargeExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == ExtraPrices.SIZE_LARGE.getName()).count();

        Double priceSize = total * ExtraPrices.SIZE_LARGE.getPrice();
        comanda.updateTotal(priceSize);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));

    }
}
