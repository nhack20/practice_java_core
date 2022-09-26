package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._4_thread_sleep_join_states;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 4. Методы sleep и join. Thread states
 * @author Sergei Begletsov
 * @version 1
 * @since 12.10.2021
 */

//1. Метод sleep(long ms) может усыпить поток на некоторое время
//2.1 Метод join() - основной поток ждет окончания других потоков
//2.2 Метод join(long ms) - основной поток ждет пока не закончится другой поток или пока не пройдет время (ms). Что из них закончится раньше - то и будет служить тригеров окончания

//3. State потоков: NEW --> RUNNABLE --> TERMAINATED
//   (ждет запуска)  READY <--/ \---> RUNNING (запущен)

public class _4_ThreadSleepJoinExample {
    public static void main(String[] args) throws InterruptedException {
        //Пример 1
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Поехали!!!");

        //Пример 2
        _4_MyExtends1 thread1 = new _4_MyExtends1();
        Thread thread2 = new Thread(new _4_MyRunnable1());
        thread1.start();
        thread2.start();


        //Поток в котором вызывается join. Мы вызываем join() внутри потока Main.
        //Тогда Main будет ждать тот поток для которого вызван join().
        //Буквально означает: подожди окончания thread1 и thread2 и после этого продолжи свою работу
        thread1.join();
        thread2.join();

        System.out.println("Finish!");
    }
}
