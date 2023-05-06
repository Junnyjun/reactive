package io.junnyland.reactive.ch2.seach_engine;

import java.net.URL;

@SuppressWarnings("unused")
public interface IterableSearchEngine {
   Iterable<URL> search(String query, int limit);
}
