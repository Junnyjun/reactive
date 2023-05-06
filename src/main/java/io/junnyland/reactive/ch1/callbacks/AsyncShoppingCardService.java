package io.junnyland.reactive.ch1.callbacks;


import java.util.function.Consumer;

public class AsyncShoppingCardService implements ShoppingCardService {

    @Override
    public void calculate(Input value, Consumer<Output> c) {
        // blocking operation is presented, better to provide answer asynchronously
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c.accept(new Output());
        }).start();
    }
}
