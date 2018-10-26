package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@lombok.Value
class MyComponent {
    private int myTestVar;

    public MyComponent(@Value("${my.test.var:15}") int myTestVar) {
        this.myTestVar = myTestVar;
    }
}
