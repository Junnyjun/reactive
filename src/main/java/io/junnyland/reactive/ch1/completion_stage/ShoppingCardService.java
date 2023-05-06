package io.junnyland.reactive.ch1.completion_stage;


import io.junnyland.reactive.ch1.commons.Output;

public interface ShoppingCardService {
    CompletionStage<Output> calculate(Input value);
}
