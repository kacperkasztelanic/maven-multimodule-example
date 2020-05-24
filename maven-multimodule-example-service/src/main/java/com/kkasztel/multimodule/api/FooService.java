package com.kkasztel.multimodule.api;

public class FooService {

    public Foo makeBarUpperCase(Foo foo) {
        return Foo.of(foo.getBar().toUpperCase());
    }
}
