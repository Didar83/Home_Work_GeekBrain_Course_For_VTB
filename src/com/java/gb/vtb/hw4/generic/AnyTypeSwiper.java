package com.java.gb.vtb.hw4.generic;

public class AnyTypeSwiper<T, V> {
    private T obj1;
    private V obj2;

    public AnyTypeSwiper(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public AnyTypeSwiper doSwipe(T obj1, V obj2){
        return new AnyTypeSwiper(obj2, obj1);
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    @Override
    public String toString() {
        return "AnyTypeSwiper{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
}
