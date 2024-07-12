package com.mylibrary.entity.cat;

public class WhiteCat extends Cat {
    public WhiteCat(String name) {
        super(name);
        // System.out.println("WhiteCat "+ name +  "is created");
        
    }
    public WhiteCat() {
        System.out.println("WhiteCat is created");
        
    }
    
    @Override
    public void makeSound() {
        System.out.println("WhiteCat is meowing");
        
    }
    
    public void scratch() {
        System.out.println("WhiteCat is scratching");
        
    }
    
}
