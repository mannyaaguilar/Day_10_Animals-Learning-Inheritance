package com.company;

public class Dog extends Animal {
    public Dog(String name, String speak) {
        super(name, speak);
    }

    @Override
    public void speak(){
        System.out.println("Woof");
    }
}
