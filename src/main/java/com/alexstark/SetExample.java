package com.alexstark;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> planetsSet = new HashSet<>();

        planetsSet.add("Mercury");
        planetsSet.add("Venus");
        planetsSet.add("Earth");
        planetsSet.add("Mars");
        planetsSet.add("Mars");
        planetsSet.add("Jupiter");

        System.out.println("Размер planetsSet до удаления = " + planetsSet.size() + " (дубль 'Mars' не учитывается)");
        for (String element : planetsSet) {
            System.out.println(element);
        }

        planetsSet.remove("Venus");
        System.out.println("Размер planetsSet после удаления = " + planetsSet.size());
        for (String element : planetsSet) {
            System.out.println(element);
        }

        System.out.println("planetsSet cодержит объект 'Mars'? Ответ: " + planetsSet.contains("Mars"));
        System.out.println("planetsSet cодержит объект 'Venus'? Ответ: " + planetsSet.contains("Venus"));

        Set<String> planetsLinkedSet = new LinkedHashSet<>();

        planetsLinkedSet.add("Mercury");
        planetsLinkedSet.add("Venus");
        planetsLinkedSet.add("Venus");
        planetsLinkedSet.add("Earth");

        System.out.println("planetsLinkedSet после инициализации (учитывается порядок добавления объектов): ");
        System.out.println(planetsLinkedSet);

        Set<String> planetsTreeSet = new TreeSet<>();

        planetsTreeSet.add("Mercury");
        planetsTreeSet.add("Venus");
        planetsTreeSet.add("Earth");
        planetsTreeSet.add("Mars");
        planetsTreeSet.add("Jupiter");

        System.out.println("planetsTreeSet после инициализации (сортировка в алфавитном порядке идет по умолчанию): ");
        System.out.println(planetsTreeSet);
    }
}
