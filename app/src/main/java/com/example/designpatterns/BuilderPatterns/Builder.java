package com.example.designpatterns.BuilderPatterns;

abstract class Builder {

    public abstract void buildPartA(String string);

    public abstract void buildPartB(String string);

    public abstract void buildPartC(String string);

    public abstract Product create();

}
