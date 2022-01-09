package com.java.gb.vtb.hw4.model;

public abstract class Fruit {
    Double fruitWeight;

    public Fruit(Double fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public Double getFruitWeight() {
        return fruitWeight;
    }
}
