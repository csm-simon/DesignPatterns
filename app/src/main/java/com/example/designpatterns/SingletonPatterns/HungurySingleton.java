package com.example.designpatterns.SingletonPatterns;

public class HungurySingleton {
    /**
     * 缺点 无法对Instance实例做延时地加载
     */

    //饿汉模式三个特征

    //static的变量
    private static HungurySingleton mHungurySingleInstance = new HungurySingleton();

    //有一个private 的构造函数
    private HungurySingleton(){}

    //getInstance方法也是static
    public static HungurySingleton getInstance() {
        return mHungurySingleInstance;
    }


}
