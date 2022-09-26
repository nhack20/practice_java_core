package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._3_parameterized_method;

import java.util.ArrayList;

/**
 * = Папка 3. Generics =
 * ---> Урок 3. Parameterized method
 * @author Sergei Begletsov
 * @since 02.10.2021
 * @version 1
 */

public class _3_ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        int a = GenericMethod.getSecondElement(intArrayList);
        System.out.println(a);

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("first");
        strArrayList.add("second");
        strArrayList.add("third");
        String string = GenericMethod.getSecondElement(strArrayList);
        System.out.println(string);
    }
}
