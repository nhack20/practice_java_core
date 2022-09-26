package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._2_parameterized_class;

/**
 * = Папка 3. Generics =
 * ---> Урок 2. Parameterized class
 * @author Sergei Begletsov
 * @since 01.10.2021
 * @version 1
 */

public class _2_ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(25);
        System.out.println(info2);
        Integer i = info2.getValue();

        Pair<String, Integer> pair1 = new Pair<>("String", 10);
        System.out.println("pair1: V1 (String) = " + pair1.getValue1() +
                                ", V2 (Integer) = " + pair1.getValue2());
    }
}
