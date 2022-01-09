package com.java.gb.vtb.hw4;

import com.java.gb.vtb.hw4.generic.AnyTypeSwiper;
import com.java.gb.vtb.hw4.model.Apple;
import com.java.gb.vtb.hw4.model.Box;
import com.java.gb.vtb.hw4.model.Orange;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {

    public static <T>ArrayList<T> convertArray(T[] arr){
        ArrayList<T> resultArray = new ArrayList<>();
        for(T obj : arr){
            resultArray.add(obj);
        }
        return resultArray;
    }
    public static void main(String[] args) {

        // task N 1
//        AnyTypeSwiper<String, Integer> stringAndInteger = new AnyTypeSwiper<>("This is a String", 123);
//        System.out.println(stringAndInteger);
//        AnyTypeSwiper<Integer, String> integerAndString = stringAndInteger.doSwipe(stringAndInteger.getObj1(), stringAndInteger.getObj2());
//        System.out.println(integerAndString);
//
//        // Task N 2
//        ArrayList<String> convertedStringArray = convertArray(new String[]{"One", "Two", "Three"});
//        System.out.println(convertedStringArray);

        // Task 3
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        System.out.println("Compare two apple boxes: " + appleBox1.compareBox(appleBox2));
        System.out.println("Compare apple and orange boxes: " + appleBox1.compareBox(orangeBox));
        System.out.println("The weight of appleBox1 = " + appleBox1.getWeight() + ", and " +
                "appleBox2 = " + appleBox2.getWeight());
        appleBox1.transferToAnotherBox(appleBox2);
        System.out.println("The weight of appleBox1 = " + appleBox1.getWeight() + ", and " +
                "appleBox2 = " + appleBox2.getWeight());
//        appleBox1.transferToAnotherBox(orangeBox);

    }
}
