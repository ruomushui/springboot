package com.john.Controller;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private String name;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private Integer age;

    @Override
    public String toString() {
        return "MyCallable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public MyCallable(String s) {

    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
