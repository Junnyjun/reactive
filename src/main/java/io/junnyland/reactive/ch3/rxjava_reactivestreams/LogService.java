package io.junnyland.reactive.ch3.rxjava_reactivestreams;

import org.reactivestreams.Publisher;

public interface LogService {
    Publisher<String> stream();
}
