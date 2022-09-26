package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._6_volatile;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 6. Ключевое слово volatile
 * @author Sergei Begletsov
 * @version 1
 * @since 13.10.2021
 */

//1. Volatile - означает изменчивый/непостоянный
//2. Ключевое слово volatile используется для пометки переменной, как хранящейся только в основной памяти <<main memory>>
//3. Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда, когда только один поток
//   может изменять значение этой переменной, а остальные потоки могут его только читать.
//4. Volatile хорошо работает когда ТОЛЬКО 1 поток ИЗМЕНЯЕТ значение переменной, а остальные читают.
//5. Для достижения синхронизации потоков, когда несколько из них могут менять значения нашей переменной ИСПОЛЬЗУЮТСЯ другие методы синхронизации.

public class _6_VolatileExample extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        _6_VolatileExample thread = new _6_VolatileExample();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of programm");
    }
}
