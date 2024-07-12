package com.mylibrary.entity.cat;

import com.mylibrary.Interfaces.Animal;

public class Cat implements Animal {
    protected String name;
    public Cat(String name) {
        this.name = name;
        // System.out.println("Cat " + name+ " is created");

    }
    public Cat() {
        System.out.println("Cat is created");

    }
    @Override
    public void eat() {
        System.out.println("Cat is eating");

    }
    
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");

    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");

    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
