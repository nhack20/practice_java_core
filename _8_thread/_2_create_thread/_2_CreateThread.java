package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._2_create_thread;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 2. Варианты создания потоков
 * @author Sergei Begletsov
 * @version 1
 * @since 12.10.2021
 */

//В данном примере между потоками нет никакой синхронизации и какой из них закончится раньше мы знать не можем
//Здесь мы не в сост. это контролировать. Их состояние не синхронизованно. Они работают одновременно и независимо.
//Синхронизация - это когда 1 поток зависит как-то от потока 2

//Варианты создания потоков:
//1. Наследуя класс Thread. Минусы (-): если класс уже экстендит Thread то он уже не может быть ничьим потомком, но можно использовать Runnable
//Создание: class MyThread extends Thread {  public void run() { код }  }
//Запуск: new MyThread().start();
//2. Используя интерфейса Runnable()
//Создание: class MyThread implements Runnable {  public void run() { код }  }
//Запуск: new Thread(new MyRunnableImpl()).start();
//3. Из за того, что в Java отсутств. множественное наследование чаще всего используют 2-ой вариант.

public class _2_CreateThread {
    public static void main(String[] args) {
        //1 Вариант создания
//        _2_Thread1CreatedExtends thread1 = new _2_Thread1CreatedExtends();
//        _2_Thread2CreatedExtends thread2 = new _2_Thread2CreatedExtends();
//        thread1.start();
//        thread2.start();

        //2 Вариант создания
        Thread thread3 = new Thread(new _2_Thread1CreatedImplements());
        Thread thread4 = new Thread(new _2_Thread2CreatedImplements());
        thread3.start();
        thread4.start();

        //3 Вариант
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        //4 Вариант
        new Thread(() -> System.out.println("hello!!!")).start();
    }
}
