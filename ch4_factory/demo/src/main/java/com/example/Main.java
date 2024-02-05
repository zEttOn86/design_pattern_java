package com.example;

import framework.Factory;
import framework.Product;

import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("hiroshi");
        Product card2 = factory.create("hhh");
        Product card3 = factory.create("aaa");
        card1.use();
        card2.use();
        card3.use();
    }
    
}
