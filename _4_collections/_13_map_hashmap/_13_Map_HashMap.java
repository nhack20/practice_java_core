package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._13_map_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 13. Введение в Map. HashMap
 * @author Sergei Begletsov
 * @since 10.11.2021
 * @version 1
 */

//1. Элементами HashMap являются пары ключ/значение.
//   HashMap не запоминает порядок добавления элементов.
//   Его методы работают очень быстро.
//2. Ключи элементов должны быть уникальными. Ключ может быть null.
//   Значения элементов могут повторяться. Значения могут быть null.
//3. Методы:
//   put, putIfAbsent, get, remove, containsKey, containsValue, keySet, values, entrySet
//4. Иерархия Map:
//                Map
//        /        |      \
//      /          |       \
//  HashMap     SortedMap  HashTable
//     |            |
//  LinkedHashMap NavigableMap
//                  |
//               TreeMap

public class _13_Map_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Zaur Tregulov");
        map.put(3569, "Ivan Ivanov");
        map.put(6578, "Mariya Sidorova");
        map.put(15879, "Nikolay Petrov");
        map.putIfAbsent(1000, "Oleg Ivanov");
        map.put(null, "Sergey Petrov");
        map.put(88567, null);
        System.out.println(map);
        System.out.println(map.get(1000));
        //map.remove(3569);
        System.out.println(map.containsValue("Mariya Sidorova"));
        System.out.println(map.containsKey(1001));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}