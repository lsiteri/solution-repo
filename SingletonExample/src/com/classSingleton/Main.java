package com.classSingleton;

public class Main {

    public static void main(String[] args) {
            Singleton instance = Singleton.getSingletonInstance();

            Singleton newInstance = Singleton.getSingletonInstance();

        System.out.println("The instance is singleton -> " +instance.equals(newInstance));
    }
}
