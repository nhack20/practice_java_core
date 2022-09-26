package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._1_intro;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 1. Ввведение в многопоточность
 * @author Sergei Begletsov
 * @version 1
 * @since 11.10.2021
 */

//1. Многопоточность - принцип построения программы при котором несколько блоков кода могут выполняться одновременно.
//2. Основные цели:
// - производительность (быстрота выполнения операций),
// - concurrency (параллельная работа всех функций).

public class _1_Intro {
    public static void main(String[] args) {
        System.out.println("Privet");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Poka");
    }
}
