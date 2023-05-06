package io.junnyland.reactive.ch1.imperative;

import io.junnyland.reactive.ch1.commons.Input;
import io.junnyland.reactive.ch1.commons.Output;

public class BlockingShoppingCardService implements ShoppingCardService {

    @Override
    public Output calculate(Input value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Output();
    }
}
