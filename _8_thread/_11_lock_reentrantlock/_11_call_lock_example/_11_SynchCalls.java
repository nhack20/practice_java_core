package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._11_lock_reentrantlock._11_call_lock_example;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 11. Lock и ReentrantLock
 * @author Sergei Begletsov
 * @version 1
 * @since 16.10.2021
 */

//1. Lock интерфейс имплементируется классом ReentrantLock.
//2. Lock нужен для синхронизации между потоками.
//3. Методы: lock - закрывает замок
//           unlock - открывает замок,
//           trylock - если удалось поставить замок
//4. trylock позволяет делать что-то если замок поставлен, иначе тоже что-то делать

public class _11_SynchCalls {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsupCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        //console:
        //Mobile call starts
        //Mobile call ends
        //Skype call starts
        //Skype call ends
        //Whatsup call starts
        //Whatsup call ends
    }
}
