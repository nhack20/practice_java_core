package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._21_atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 21. Класс AtomicInteger
 * @author Sergei Begletsov
 * @version 1
 * @since 19.10.2021
 */

//1. AtomicInteger - класс, который предоставляет возможность работать с типом int используя атомарные операции.
//   Никакого data race не будет
//2. Методы:
// - incrementAndGet увеличивает и потом получает
// - getAndIncrement получает и потом увеличивает
// - AddAnsGet(int num) увеличивает на 5
// - getAndAdd
// - decrementAndGet
// - getAndDecrement


public class _21_AtomicIntegerExample {
    //static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();

    //public synchronized static void increment() {
    public static void increment() {
        //counter++;
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunnableImpl21());
        Thread thread2 = new Thread(new RunnableImpl21());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
