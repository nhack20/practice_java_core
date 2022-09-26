package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._12_stack;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 12. Stack
 * @author Sergei Begletsov
 * @since 30.10.2021
 * @version 1
 */

//1. Stack – устаревший synchronized класс. Использует принцип LIFO.
//   Не рекомендован для использования.
//2. Методы: push, pop, peek, isEmpty

public class _12_Stack {

    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        System.out.println("main ends");
    }
}
