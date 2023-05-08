package io.junnyland.reactive.ch5;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import reactor.core.publisher.Flux;

public class ReactiveFileReader {

    public Flux<DataBuffer> backpressuredShakespeare() {
        return DataBufferUtils
            .read(
                new DefaultResourceLoader().getResource("hamlet.txt"),
                new DefaultDataBufferFactory(),
                1024
            )
            .log();
    }

}
