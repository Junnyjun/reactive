package io.junnyland.reactive.ch1.callbacks;

import io.junnyland.reactive.ch1.commons.Input;

public interface ShoppingCardService {
    void calculate(Input value, Consumer<Output> c);
}
