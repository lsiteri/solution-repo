package com.classSingleton;

public class Singleton {

    private static Singleton singletonInstance = null;

    private Singleton() {
    }

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

}
