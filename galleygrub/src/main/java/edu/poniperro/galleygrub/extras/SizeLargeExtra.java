package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extras {

    private Double SIZE_PRICE = 0.50;

    public SizeLargeExtra() {
    };

    public void sumExtras(Comanda comanda) {
        long total = comanda.intemList().stream().filter(i -> i.extra() == SIZE_LARGE).count();

        Double priceSize = total * SIZE_PRICE;
        comanda.updateTotal(priceSize);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));

    }
}
