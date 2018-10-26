package com.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyComponent2 {
    private final MyComponent myComponent;

    @Autowired
    public MyComponent2(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    void test() {
        log.warn(String.format("my.test.var=%d", myComponent.getMyTestVar()));
    }
}
