package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._1_intro_map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * = Папка 7. Streams =
 * ---> Урок 1. Введение в Streams. Метод map
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

//Stream позволяет писать код в функциональном стиле
//Метод map() - обрабатывает, применяется к каждому элементу!
//ВАЖНО! Метод map() или другие не меняют саму коллекцию у которой был вызван stream

public class _1_Intro_Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        //было:
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

        //стало:
        List<Integer> listStream =
            list.stream()
                .map(elem -> elem.length())
                .collect(Collectors.toList());
        //.forEach((elem) -> {System.out.print(elem + " ");});
        System.out.println(listStream); //[6, 9, 2, 4]

        int[] array = {5, 4 ,3 ,2, 1, 6, 9};
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element /= 3;
                    }
                    return  element;
                })
                .toArray();
        System.out.println(Arrays.toString(array)); //[5, 4, 1, 2, 1, 2, 3]

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set); //[kak dela?, ok, poka, privet]

        Set<Integer> sortedSed = set.stream()
                    .map(el -> el.length())
                    .collect(Collectors.toSet());
        System.out.println(sortedSed); //[2, 4, 6, 9]
    }
}
