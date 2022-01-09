package com.java.gb.vtb.hw5;

import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        //Task 1
        String[] stringArray = {"Anna", "Anna", "Isabella", "Cinderella", "Rapunzel", "Alexandra",
                "Dana", "Amira", "Natasha", "Marina", "Irina", "Inna", "Samira", "Violetta", "Mika",
                "Dina", "Anika", "Rosie", "Bella", "Natalie"};

        Map<String, Integer> distinctMap = new HashMap<>();
        for(String s : stringArray){
            distinctMap.put(s, distinctMap.getOrDefault(s, 0) + 1);
//            if(distinctMap.isEmpty() || !distinctMap.containsKey(s)) {
//                distinctMap.put(s, 1);
//            } else {
//                Integer count = distinctMap.get(s) + 1;
//                distinctMap.put(s, count);
//            }
        }
        System.out.println(stringArray.length);
        System.out.println(distinctMap);
        System.out.println(distinctMap.size());

        //Task 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anna", "+71101101100");
        phoneBook.add("Anna", "+71101101110");
        phoneBook.add("Anna", "+71101101111");
        phoneBook.get("Anna");
        phoneBook.get("Inna");
    }
}
