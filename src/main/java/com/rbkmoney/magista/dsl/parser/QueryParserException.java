package com.rbkmoney.magista.dsl.parser;

import com.rbkmoney.magista.dsl.QueryExecutionException;

public class QueryParserException extends QueryExecutionException {
    public QueryParserException() {
    }

    public QueryParserException(String message) {
        super(message);
    }

    public QueryParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryParserException(Throwable cause) {
        super(cause);
    }

    public QueryParserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
