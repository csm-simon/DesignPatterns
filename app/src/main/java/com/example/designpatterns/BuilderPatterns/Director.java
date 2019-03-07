package com.example.designpatterns.BuilderPatterns;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(String a, String b, String c) {
        builder.buildPartA(a);
        builder.buildPartB(b);
        builder.buildPartC(c);
        return builder.create();
    }
}
