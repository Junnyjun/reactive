package io.junnyland.reactive.ch1.callbacks;


import io.junnyland.reactive.ch1.commons.Input;

public class SyncShoppingCardService implements ShoppingCardService {

    @Override
    public void calculate(Input value, Consumer<Output> c) {
        // No blocking operation, better to immediately provide answer
        c.accept(new Output());
    }
}
