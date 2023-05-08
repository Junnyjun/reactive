package io.junnyland.reactive.ch6.functional.springboot;

import reactor.core.publisher.Mono;


public interface OrderRepository {

    Mono<Order> findById(String id);

    Mono<Order> save(Order order);

    Mono<Void> deleteById(String id);
}
