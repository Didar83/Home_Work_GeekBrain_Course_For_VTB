package com.java.gb.vtb.hw1;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkOne {
    public static void main(String[] args) {
        Animal a1 = new Cat("Barsik");
        Animal a2 = new Dog("Bobik");
        Animal a3 = new Tiger("RorRor");
        Animal a4 = new Cat("Marsik");
        Animal a5 = new Dog("Tuzik");
        Animal a6 = new Cat("Valsik");
        Animal a7 = new Tiger("Rrrrroooorr");
        Animal a8 = new Cat("Pupsik");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        animalList.add(a5);
        animalList.add(a6);
        animalList.add(a7);
        animalList.add(a8);
        animalList.add(a8);
        animalList.add(a8);
        animalList.add(a8);

        for(Animal animal : animalList){
            Integer distanceRun = (int)Math.ceil(Math.random()*1000);
            Integer distanceSwim = (int)Math.ceil(Math.random()*100);
            animal.run(distanceRun);
            animal.swim(distanceSwim);
        }
        System.out.println(Animal.count());
    }
}
