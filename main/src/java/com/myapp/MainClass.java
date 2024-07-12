package com.myapp;
import com.mylibrary.Interfaces.Animal;
import com.mylibrary.entity.cat.Cat;
import com.mylibrary.entity.dog.Dog;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import com.myapp.database.MySQL;

class DogMain implements Runnable {
    public void run() {
        List<Animal> dogs = new ArrayList<>();
        try {
            File file = new File("dog_names.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                Dog dog = new Dog(name);
                dogs.add(dog);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
        }
        for (Animal dog : dogs) {
            System.out.println("Dog " + dog.getName());
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CatMain implements Runnable {
    public void run() {
        List<Animal> cats = new ArrayList<>();
        try {
            File file = new File("cat_names.txt");
            Scanner fileScanner = new Scanner(file);
            

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                Cat cat = new Cat(name);
                cats.add(cat);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
        }
        for (Animal cat : cats) {
            System.out.println("Cat " + cat.getName());
            try{
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MainClass {

    public static void main(String[] args) {
        MySQL.getInstance();

        System.out.println("\n-------------------------------------------------------------\n");

        Runnable dogMain = new DogMain();
        Runnable catMain = new CatMain();

        Thread t1 = new Thread(dogMain);
        Thread t2 = new Thread(catMain);

        t1.start();
        t2.start();

    }
    
}
