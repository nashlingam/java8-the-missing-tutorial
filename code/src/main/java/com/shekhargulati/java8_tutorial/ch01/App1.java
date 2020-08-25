package com.shekhargulati.java8_tutorial.ch01;

public class App1 implements A {
    @Override
    public void doSth() {
        System.out.println("inside App1");
    }

    public static void main(String[] args) {
        new App1().doSth();
    }
}

// This is a comment from branch lr - 1

interface A {
    default void doSth() {
        System.out.println("inside A");
    }
}
