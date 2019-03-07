package com.example.designpatterns.SingletonPatterns;

public class DCLSingleton {

    private static DCLSingleton mDCLSingleton;

    private DCLSingleton () {}

    private static DCLSingleton getInstance() {
        if (mDCLSingleton == null) { //避免不必要的同步
            synchronized (DCLSingleton.class) {
                if (mDCLSingleton == null) {
                    mDCLSingleton = new DCLSingleton();
                    /**
                     * new 语句不是原子操作，这行代码最终会被编译成多条汇编指令，大致有3件事
                     * 1）给Singlton分配内存空间
                     * 2）调用Singleton()构造函数，初始化成员变量
                     * 3）将mDCLSinglton对象指向分配的内存空间，此时mDCLSingleton就不等于null了
                     *
                     * JVM指令重排序导致以上指令不一定会按顺序执行 可能执行顺序为 1) -> 3) -> 2)
                     * 若另一个线程在3)完成之后就取走了mDCLSingleton 则会出错，这就是DCL失效的原因
                     * 解决方法 使用volatitle关键字定义mDCLSingleton
                     *     private static volatile DCLSingleton mDCLSingleton;
                     */
                }
            }
        }
        return mDCLSingleton;
    }
}
