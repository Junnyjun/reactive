package io.junnyland.reactive.ch2.seach_engine;

import java.net.URL;
import java.util.List;

@SuppressWarnings("unused")
public interface SearchEngine {
   List<URL> search(String query, int limit);
}
