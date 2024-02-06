package com.example;

import com.example.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        System.out.println("End.");
    }
}