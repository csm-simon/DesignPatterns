package com.example.designpatterns.BuilderPatterns;

public class Test {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct("a","b","c");
    }
}
