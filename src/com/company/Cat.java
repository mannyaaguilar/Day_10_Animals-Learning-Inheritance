package com.company;

public class Cat extends Animal {
    public Cat(String name, String speak) {
        super(name, speak);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
