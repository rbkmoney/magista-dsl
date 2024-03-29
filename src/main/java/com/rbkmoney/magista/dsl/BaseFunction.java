package com.rbkmoney.magista.dsl;


public abstract class BaseFunction<T, CT> extends BaseQuery<T, CT> implements FunctionQuery<T, CT> {
    private final String name;

    public BaseFunction(Object descriptor, QueryParameters params, String name) {
        super(descriptor, params);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
