package com.java.gb.vtb.hw1;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    private String name;
    private Integer distanceForRunLimit;
    private Integer distanceForSwimLimit;
    private static Map<String, Integer> counter = new HashMap<>();

    public Animal(String name, Integer distanceForRunLimit, Integer distanceForSwimLimit) {
        this.name = name;
        String className = getClass().getSimpleName();
        this.distanceForRunLimit = distanceForRunLimit;
        this.distanceForSwimLimit = distanceForSwimLimit;
        if (counter.containsKey(className)){
            counter.merge(className, 1, Integer::sum);
        } else {
            counter.put(className, 1);
        }
    }

    public void run(Integer distance){
        System.out.println(name + " пробежал " + (distance > distanceForRunLimit ? distanceForRunLimit : distance) + " м." + " Заданная дистанция:" + distance);
    };

    public void swim(Integer distance){
        System.out.println((distanceForSwimLimit > 0 ? name + " проплыл " +
                (distance > distanceForSwimLimit ? distanceForSwimLimit : distance) + " м." : name + " не умеет плавать.") + " Заданная дистанция:" + distance);
    };

    public static String count(){
        String result = "";
        int count = 0;
        for(String s : counter.keySet()){
            count = count + counter.get(s);
            result = result + s + ": " + counter.get(s) + ". ";
        }
        result = result + " Total quantity: " + count;
        return result;
    }
}
