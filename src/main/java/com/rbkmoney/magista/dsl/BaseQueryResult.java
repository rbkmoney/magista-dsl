package com.rbkmoney.magista.dsl;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class BaseQueryResult<T, CT> implements QueryResult<T, CT> {
    private final Supplier<Stream<T>> streamSupplier;
    private final Supplier<CT> collectedSuppier;

    public BaseQueryResult(Supplier<Stream<T>> streamSupplier, Supplier<CT> collectedSupplier) {
        this.streamSupplier = streamSupplier;
        this.collectedSuppier = collectedSupplier;
    }

    @Override
    public Stream<T> getDataStream() {
        return streamSupplier.get();
    }

    @Override
    public CT getCollectedStream() {
        return collectedSuppier.get();
    }
}
