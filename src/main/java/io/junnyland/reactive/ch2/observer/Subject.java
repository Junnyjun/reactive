package io.junnyland.reactive.ch2.observer;

public interface Subject<T> {
   void registerObserver(Observer<T> observer);

   void unregisterObserver(Observer<T> observer);

   void notifyObservers(T event);
}
