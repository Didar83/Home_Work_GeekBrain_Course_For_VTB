package com.java.gb.vtb.hw3;

import com.java.gb.vtb.hw3.exception.MyArrayDataException;
import com.java.gb.vtb.hw3.exception.MyArraySizeException;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args)  {
        String s1[][] = {
                {"00", "01", "02", "03"},
                {"10", "11", "12", "13"},
                {"20", "21", "22", "23"},
                {"rrr", "31", "32", "33"},
        };

        try{
            checkArrayAndSum(s1);
        } catch (MyArraySizeException ex){
            System.out.println("Error" + ex);
        }

        String s2[][] = {
                {"00", "01", "02", "03"},
                {"10", "11", "12", "13"},
                {"20", "21", "22", "23"},
                {"30", "31", "32", "33"},
        };
        try{
            checkArrayAndSum(s2);
        } catch (MyArraySizeException ex){
            System.out.println("Error" + ex);
        }
    }

    public static void checkArrayAndSum(String stringArray[][]) throws MyArraySizeException {
        Integer result = 0;

        if (stringArray.length !=4 || stringArray[0].length !=4){
            throw new MyArraySizeException("Array's length should be 4x4. But array size is " + stringArray.length + " x " + stringArray[0].length);
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                try{
                    result += Integer.valueOf(stringArray[i][j]);
                } catch(NumberFormatException ex){
                    System.out.println("The value of array not a number: [" + i + "] [" + j + "] = " + stringArray[i][j]);
                }
            }
        }
        System.out.println(result);
    }


}
