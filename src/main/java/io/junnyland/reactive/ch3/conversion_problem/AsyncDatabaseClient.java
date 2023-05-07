package io.junnyland.reactive.ch3.conversion_problem;

import java.util.concurrent.CompletionStage;

public interface AsyncDatabaseClient {

	<T> CompletionStage<T> store(CompletionStage<T> stage);
}
