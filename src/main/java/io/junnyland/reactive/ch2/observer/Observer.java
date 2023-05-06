package io.junnyland.reactive.ch2.observer;

public interface Observer<T> {
   void observe(T event);
}
