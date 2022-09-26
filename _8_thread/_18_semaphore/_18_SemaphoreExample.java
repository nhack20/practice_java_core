package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._18_semaphore;

import java.util.concurrent.Semaphore;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 18. Синхронизатор Semaphore
 * @author Sergei Begletsov
 * @version 1
 * @since 18.10.2021
 */

//1. Semaphore - синхронизатор, позволяющий ограничить доступ к какому-то ресурсу.
//   В конструктор Semaphore нужно передавать кол-во потоков, которым Semaphore будет разрешать одновременно использовать этот ресурс.
//2. Методы
//
//

public class _18_SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Lena", callBox);
        new Person("Victor", callBox);
        new Person("Marina", callBox);
    }
}
