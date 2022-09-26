package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._13_interrupted_thread;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 13. Прерывание потоков
 * @author Sergei Begletsov
 * @version 1
 * @since 16.10.2021
 */

//1. У нас есть возможность послать сигнал потоку, что мы хотим его прервать, метод interrupt().
//2. Есть возможность проверить в самом потоке, что его хотят прервать, метод isInterrupted()

public class _13_InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        InterruptedThread interrupted = new InterruptedThread();
        interrupted.start();
        Thread.sleep(1000);
        interrupted.interrupt();

        interrupted.join();
        System.out.println("Main thread ends");
    }
}
