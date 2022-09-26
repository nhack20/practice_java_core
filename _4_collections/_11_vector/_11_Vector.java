package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._11_vector;

import java.util.Vector;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 11. Vector
 * @author Sergei Begletsov
 * @since 30.10.2021
 * @version 1
 */

//1. Vector – устаревший synchronized класс. В своей основе содержит массив элементов Object.
//   Не рекомендован для использования.
//2. Методы: add, get, remove, firstElement, lastElement.

public class _11_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
