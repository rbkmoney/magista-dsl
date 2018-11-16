package com.rbkmoney.magista_dsl.core;

import java.util.stream.Stream;

/**
 * Created by vpankrashkin on 03.08.16.
 */
public interface QueryResult<T, CT> {

    Stream<T> getDataStream();

    CT getCollectedStream();

}

