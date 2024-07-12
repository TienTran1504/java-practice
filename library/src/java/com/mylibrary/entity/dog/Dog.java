package com.mylibrary.entity.dog;
import com.mylibrary.Interfaces.Animal;

public class Dog implements Animal {
    private String name;
    public Dog(String name) {
        this.name = name;
        // System.out.println("Dog "+ name + " is created");
        
    }
    public Dog() {
        System.out.println("Dog is created");
        
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");

    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");

    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
