package com.alexstark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("apple");
        fruitsList.add("kiwi");
        fruitsList.add("lime");
        fruitsList.add("melon");
        fruitsList.add("peach");

        System.out.println("fruitsList после инициализации: ");
        for (String name : fruitsList) {
            System.out.println(name);
        }

        System.out.println("fruitsList после удаления элементов с индексом = 4 и названием объекта = 'melon':");
            fruitsList.remove(4);
            fruitsList.remove("melon");
            System.out.println(fruitsList);

        if (fruitsList.contains("melon")) {
            String example = fruitsList.get(1);
            System.out.println();
            System.out.println(example);
            System.out.println();
        }

        Collections.sort(fruitsList);
        System.out.println("fruitsList отсортированный по алфавиту: " + fruitsList);

        Collections.reverse(fruitsList);
        System.out.println("fruitsList отсортированный по алфавиту в обратном порядке: " + fruitsList);
    }
}
