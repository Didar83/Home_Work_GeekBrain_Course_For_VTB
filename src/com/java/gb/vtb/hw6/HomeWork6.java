package com.java.gb.vtb.hw6;

import java.util.Arrays;

public class HomeWork6 {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void firstMethod(){
        float[] arr = new float [SIZE];
        Long start = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        System.out.println((System.currentTimeMillis() - start) + " ms");
        System.out.println(arr[0]);
    }

    public static void secondMethod() throws InterruptedException {
        float[] arr = new float [SIZE];
        Arrays.fill(arr, 1);
        Long start = System.currentTimeMillis();
        float[] arr1 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < arr1.length; i++){
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < arr2.length; i++){
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println((System.currentTimeMillis() - start) + " ms");
        System.out.println(arr[0]);
        System.out.println(arr[500_000]);
    }
    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();
    }
}
