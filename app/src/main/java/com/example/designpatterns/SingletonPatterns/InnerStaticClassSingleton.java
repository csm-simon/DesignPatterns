package com.example.designpatterns.SingletonPatterns;

public class InnerStaticClassSingleton {

    /**
     * 第一次加载InnerStaticClassSingleton类并不会初始化mInnerStaticClassInstance
     * 第一次调用getInstance()方法才会导致虚拟机加载SingletonHolder类
     * 利用JVM进行类加载的时候保证数据同步
     * 确保了线程安全
     * 保证单例对象唯一性
     * 也实现了延迟单例实例化
     * 推荐使用
     */
    private InnerStaticClassSingleton (){}

    public static InnerStaticClassSingleton getInstance() {
        return SingletonHolder.mInnerStaticClassInstance;
    }

    private static class SingletonHolder {
        private static final InnerStaticClassSingleton mInnerStaticClassInstance = new InnerStaticClassSingleton();
    }
}
