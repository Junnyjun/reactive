package io.junnyland.reactive.ch2.observer;

public interface RxObserver<T> {
   void onNext(T next);
   void onComplete();
   void onError(Exception e);
}
