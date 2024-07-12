package com.mylibrary.entity.cat;

public class BlueCat extends Cat {
    public BlueCat(String name) {
        super(name);
        // System.out.println("BlueCat " + name  + " is created");
        
    }
    public BlueCat() {
        System.out.println("BlueCat is created");
        
    }
    
    @Override
    public void makeSound() {
        System.out.println("BlueCat is meowing");
        
    }
    
    public void scratch() {
        System.out.println("BlueCat is scratching");
        
    }
    
}
