package io.junnyland.reactive.ch3.pure_pull_model;

import java.util.concurrent.CompletionStage;

public interface AsyncDatabaseClient {

	CompletionStage<Item> getNextAfterId(String id);
}
