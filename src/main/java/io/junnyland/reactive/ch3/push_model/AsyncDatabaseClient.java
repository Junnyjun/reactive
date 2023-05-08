package io.junnyland.reactive.ch3.push_model;

import rx.Observable;

public interface AsyncDatabaseClient {

	Observable<Item> getStreamOfItems();
}
