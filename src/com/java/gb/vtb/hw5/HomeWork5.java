package com.java.gb.vtb.hw5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWork5 {
    public static void main(String[] args) {
        //Task 1
        String[] stringArray = {"Anna", "Anna", "Isabella", "Cinderella", "Rapunzel", "Alexandra",
                "Dana", "Amira", "Natasha", "Marina", "Irina", "Inna", "Samira", "Violetta", "Mika",
                "Dina", "Anika", "Rosie", "Bella", "Natalie"};
        Set<String> distinctArray = new HashSet<>();
        distinctArray.addAll(Arrays.asList(stringArray));
        distinctArray.addAll(Arrays.asList(stringArray));
        distinctArray.addAll(Arrays.asList(stringArray));
        System.out.println(stringArray.length);
        System.out.println(distinctArray);
        System.out.println(distinctArray.size());

        //Task 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anna", "+71101101100");
        phoneBook.add("Anna", "+71101101110");
        phoneBook.add("Anna", "+71101101111");
        phoneBook.get("Anna");
        phoneBook.get("Inna");
    }
}
