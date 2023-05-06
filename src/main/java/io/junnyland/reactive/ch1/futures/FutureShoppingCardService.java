package io.junnyland.reactive.ch1.futures;


import io.junnyland.reactive.ch1.commons.Input;
import io.junnyland.reactive.ch1.commons.Output;

import java.util.concurrent.FutureTask;

public class FutureShoppingCardService implements ShoppingCardService {

    @Override
    public Future<Output> calculate(Input value) {
        FutureTask<Output> future = new FutureTask<>(() -> {
            Thread.sleep(1000);
            return new Output();
        });

        new Thread(future).start();

        return future;
    }
}
