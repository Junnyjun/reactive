package io.junnyland.reactive.ch3.rxjava_reactivestreams;

import org.reactivestreams.Publisher;

public interface FileService {

    void writeTo(String file, Publisher<String> content);
}
