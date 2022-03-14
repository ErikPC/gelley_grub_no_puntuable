package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extras {

    public Regular() {
    }

    public void sumExtras(Comanda comanda) {
        Optional<Double> total = comanda.intemList().stream().map(i -> i.price()).reduce(Double::sum);
        total.ifPresent(comanda::updateTotal);

        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    };
}
