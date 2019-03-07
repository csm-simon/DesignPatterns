package com.example.designpatterns.SingletonPatterns;

public class LazySingleton {
    /**
     * 缺点：在多线程并发下懒汉模式是无法保证实例唯一的
     */

    private static LazySingleton mLazySingleton;

    private LazySingleton () {}

    //不是同步
    public static LazySingleton getInstance() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }

//    /**
//     * 懒汉线程安全实现方式
//     * 缺点：性能降低
//     */
//
//    //1.方法中声明synchronized
//    public static synchronized LazySingleton getInstance() {
//        if (mLazySingleton == null) {
//            mLazySingleton = new LazySingleton();
//        }
//        return mLazySingleton;
//    }
//
//    //2.同步代码块实现
//    public static LazySingleton getInstance() {
//        synchronized (LazySingleton.class) {
//            if (mLazySingleton == null) {
//                mLazySingleton = new LazySingleton();
//            }
//        }
//        return mLazySingleton;
//    }

}
