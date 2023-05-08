package io.junnyland.reactive.ch5;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import org.springframework.core.ReactiveAdapter;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.core.ReactiveTypeDescriptor;

public class MaybeReactiveAdapter extends ReactiveAdapter {

    static {
        ReactiveAdapterRegistry
            .getSharedInstance()
            .registerReactiveType(
                ReactiveTypeDescriptor.singleOptionalValue(Maybe.class, Maybe::empty),
                rawMaybe -> ((Maybe<?>)rawMaybe).toFlowable(),
                publisher -> Flowable.fromPublisher(publisher).singleElement()
            );
    }

    public MaybeReactiveAdapter() {
        super(
            ReactiveTypeDescriptor.singleOptionalValue(Maybe.class, Maybe::empty),
            rawMaybe -> ((Maybe<?>)rawMaybe).toFlowable(),
            publisher -> Flowable.fromPublisher(publisher).singleElement()
        );
    }
}
