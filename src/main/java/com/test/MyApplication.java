package com.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.test")
public class MyApplication implements CommandLineRunner {

    private final MyComponent2 myComponent2;

    public MyApplication(MyComponent2 myComponent2) {
        this.myComponent2 = myComponent2;
    }
    public static void main(String[] args) {
        SpringApplication.run(MyApplication .class,args);
    }

    @Override
    public void run(String... args) {
        myComponent2.test();
    }
}

