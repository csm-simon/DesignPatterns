package com.example.designpatterns.BuilderPatterns;

public class ConcreteBuilder extends Builder{

    private Product mProduct = new Product();

    @Override
    public void buildPartA(String string) {
        mProduct.setPartA(string);
    }

    @Override
    public void buildPartB(String string) {
        mProduct.setPartB(string);
    }

    @Override
    public void buildPartC(String string) {
        mProduct.setPartC(string);
    }

    @Override
    public Product create() {
        return mProduct;
    }

}
