package com.java.training.collections;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Nissan");

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println("After sorting");
        System.out.println(cars);
    }
}
