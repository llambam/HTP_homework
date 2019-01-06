package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public String[] keyArray;
    public int numberOfKeys;
    public Integer maxValue;

    public Task5() {
    }

    public void task5() {
        numberOfKeys = 9;

        String[] keyArray = {"Электроника",
                "Компьютуры и сети",
                "Бытовая техника",
                "Стройка",
                "Дом",
                "Авто",
                "Спорт",
                "Детям",
                "Работа и офис"};
//
//
        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put(keyArray[0], 12);
        hashmap.put(keyArray[1], 2);
        hashmap.put(keyArray[2], 15);
        hashmap.put(keyArray[3], 19);
        hashmap.put(keyArray[4], 0);
        hashmap.put(keyArray[5], 0);
        hashmap.put(keyArray[6], 12);
        hashmap.put(keyArray[7], 7);
        hashmap.put(keyArray[8], 12);
        System.out.println("All keys and values: ");
        for (Map.Entry e : hashmap.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }


        System.out.println("Sorted list:  ");
        List sortedList = new ArrayList(hashmap.entrySet());
        sortedList.sort(Comparator.comparing(Object::hashCode));
        Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });
        for (Object l : sortedList) {
            System.out.println(l);
        }

        maxValue = 0;
        for (Integer i : hashmap.values()) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        System.out.println("Max value: " + maxValue);


        for (int i = 0; i < numberOfKeys; i++) {
            if (hashmap.get(keyArray[i]) == 0) {
                hashmap.remove(keyArray[i]);
            }
        }
        System.out.println("All keys and values after zero del: ");
        for (Map.Entry e : hashmap.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }

    }

}
