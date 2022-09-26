package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._1_intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Раздел 3. Generics
 * Урок 1. Введение в generics
 * @author Sergei Begletsov
 * @since 01.10.2021
 * @version 1
 */

public class _1_IntroGeneric {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Vasia");
        name.add("Petya");
        name.add("Lida");
        name.add("Nadia");

        for (Object obj: name) {
            System.out.println(obj + " dlina: " + ((String) obj).length());
        }
    }
}
