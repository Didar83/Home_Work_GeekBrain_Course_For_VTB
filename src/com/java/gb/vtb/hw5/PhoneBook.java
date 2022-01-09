package com.java.gb.vtb.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBookExample;

    public PhoneBook() {
        this.phoneBookExample = new HashMap<>();
    }

    public void add(String name, String phoneNumber){
        if(phoneBookExample.containsKey(name)){
            phoneBookExample.get(name).add(phoneNumber);
        } else {
            phoneBookExample.put(name, new ArrayList<>(Arrays.asList(phoneNumber)));
        }
    }

    public void get(String name){
        if(phoneBookExample.isEmpty() || !phoneBookExample.containsKey(name)){
            System.out.println("There is no records with name: " + name);
        } else {
            ArrayList<String> phones = phoneBookExample.get(name);
            System.out.println(name + ": " + phoneBookExample.get(name));
        }
    }
}
