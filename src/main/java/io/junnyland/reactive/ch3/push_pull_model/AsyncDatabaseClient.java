package io.junnyland.reactive.ch3.push_pull_model;

import org.reactivestreams.Publisher;

public interface AsyncDatabaseClient {

	Publisher<Item> getStreamOfItems();
}
