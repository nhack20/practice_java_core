package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._3_predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("ok");
        arrayList.add("uchim java");
        arrayList.add("a imenno lambda");
        //Predicate<String> p = elem -> elem.length() > 5;
        arrayList.removeIf(elem -> elem.length() > 5);
        System.out.println(arrayList);
    }
}
