package com.alexstark;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        // HashMap
        Map<String, String> dictionaryMap = new HashMap<>();

        dictionaryMap.put("Nature", "Природа");
        dictionaryMap.put("Animals", "Животные");
        dictionaryMap.put("Sea", "Море");
        dictionaryMap.put("Sea", "Море");
        dictionaryMap.put("Forest", "Лес");
        dictionaryMap.put("Wind", "Ветер");

        System.out.println("dictionaryMap после инициализации (дубль 'Sea' не учитывается): ");
        for (HashMap.Entry<String, String> entries : dictionaryMap.entrySet())
            System.out.println(entries.getKey() + " - " + entries.getValue());

        dictionaryMap.remove("Forest");

        System.out.println("Размер dictionaryMap после удаления = " + dictionaryMap.size());
        for (HashMap.Entry<String, String> entries : dictionaryMap.entrySet())
            System.out.println(entries.getKey() + " - " + entries.getValue());

        System.out.println("dictionaryMap содержит 'key' = 'Forest'? Ответ: " + dictionaryMap.containsKey("Forest"));
        System.out.println("dictionaryMap содержит 'value' = 'Природа'? Ответ: " + dictionaryMap.containsValue("Природа"));

        // LinkedHashMap
        Map<String, String> dictionaryLinkedMap = new LinkedHashMap<>();

        dictionaryLinkedMap.put("Nature", "Природа");
        dictionaryLinkedMap.put("Animals", "Животные");
        dictionaryLinkedMap.put("Sea", "Море");
        dictionaryLinkedMap.put("Forest", "Лес");
        dictionaryLinkedMap.put("Wind", "Ветер");

        System.out.println("dictionaryLinkedMap после инициализации (учитывается порядок добавления объектов): ");
        for (HashMap.Entry<String, String> entries : dictionaryLinkedMap.entrySet())
            System.out.println(entries.getKey() + " - " + entries.getValue());

        // TreeMap
        Map<String, String> dictionaryTreeMap = new TreeMap<>();

        dictionaryTreeMap.put("Nature", "Природа");
        dictionaryTreeMap.put("Animals", "Животные");
        dictionaryTreeMap.put("Sea", "Море");
        dictionaryTreeMap.put("Forest", "Лес");
        dictionaryTreeMap.put("Wind", "Ветер");

        System.out.println("dictionaryLinkedMap после инициализации (сортировка ключей в алфавитном порядке): ");
        Set<String> keys = dictionaryTreeMap.keySet();
        System.out.println(keys);
    }
}



