package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._7_data_race_synchronized_methods;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 7. Data race. Synchronized methods
 * @author Sergei Begletsov
 * @version 1
 * @since 14.10.2021
 */

//1. Data race - гонка данных, потоки как бы стараются побыстрей проделать свои операции и работают они с одной переменной.
//2. Data race - проблема, которая может возникнуть, когда 2 и более потоков обращаются к 1 и той же переменной и как минимум 1 поток ее изменяет.
//3. Добавление к методу слова synchronize дает право на изменение пар-ра только 1 потоку, когда 1 поток не закончил действия - второй не сможет изменять данные. не будет data race.
//4. public synchronized void abc() {  body method  }

public class _7_DataRace {
    public static void main(String[] args) throws InterruptedException {
        //1. Пример когда потоки не синхронизированы
        //3 1 2 5 4 7 6 8 9
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println();
        //2. Пример когда потоки синхронизированы
        //300
        MyRunnableImpl2 runnable2 = new MyRunnableImpl2();
        Thread thread4 = new Thread(runnable2);
        Thread thread5 = new Thread(runnable2);
        Thread thread6 = new Thread(runnable2);
        thread4.start();
        thread5.start();
        thread6.start();
        thread4.join();
        thread5.join();
        thread6.join();

        System.out.println(Counter2.counter);
    }
}
