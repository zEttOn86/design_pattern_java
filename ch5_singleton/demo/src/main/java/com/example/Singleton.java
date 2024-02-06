package com.example;

public class Singleton {
    private static Singleton singletone = new Singleton();

    private Singleton(){
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance(){
        return singletone;
    }
    
}
