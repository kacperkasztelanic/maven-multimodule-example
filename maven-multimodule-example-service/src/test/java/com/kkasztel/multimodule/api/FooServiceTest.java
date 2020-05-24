package com.kkasztel.multimodule.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooServiceTest {

    @Test
    void makeBarUpperCaseIsCorrect() {
        FooService service = new FooService();
        String expected = "BAR";
        String actual = service.makeBarUpperCase(Foo.of("bar")).getBar();
        assertEquals(expected, actual);
    }
}
