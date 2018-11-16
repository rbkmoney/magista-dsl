package com.rbkmoney.magista_dsl.core.builder;

import com.rbkmoney.magista_dsl.core.QueryProcessingException;

/**
 * Created by vpankrashkin on 24.08.16.
 */
public class QueryBuilderException extends QueryProcessingException {
    public QueryBuilderException() {
    }

    public QueryBuilderException(String message) {
        super(message);
    }

    public QueryBuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryBuilderException(Throwable cause) {
        super(cause);
    }

    public QueryBuilderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
