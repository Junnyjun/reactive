package io.junnyland.reactive.ch1.completion_stage;


public class CompletionStageShoppingCardService implements ShoppingCardService {

    @Override
    public CompletionStage<Output> calculate(Input value) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return new Output();
        });
    }
}
