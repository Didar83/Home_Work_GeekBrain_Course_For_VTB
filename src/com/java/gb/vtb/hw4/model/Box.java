package com.java.gb.vtb.hw4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }

    public void addFruit(T... fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public Double getWeight(){
        if(fruits.size() == 0){
            return 0.0d;
        }
        return fruits.size() * fruits.get(0).getFruitWeight();
    }

    public void transferToAnotherBox(Box<T> box){
        this.fruits.addAll(box.getFruits());
        box.getFruits().clear();
    }

    public boolean compareBox(Box<?> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }
}
