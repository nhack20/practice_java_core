package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._10_deadlock_livelock_starvation;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 10. Понятия Deadlock, Livelock, Lock Starvation
 * @author Sergei Begletsov
 * @version 1
 * @since 15.10.2021
 */

//1. Deadlock - мертвый замок из которого не выходит поток и никогда больше не закончится
//2. Deadlock - ситуация, когда 2 или более потоков залочены навсегда, ждут друг друга и ничего не делают
//3. Livelock - ситуация, когда 2 или более потоков залочены навсегда, ждут друг друга, проделывают какую-то работу без какого-либо прогресса.
//4. Lock starvation - ситуация, когда менее приоритетные потоки джут долгое время или время для того, чтобы могли запуститься.

public class _10_DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}
