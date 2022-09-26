package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._24_copyonwritearraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 24. CopyOnWriteArrayList
 * @author Sergei Begletsov
 * @version 1
 * @since 20.10.2021
 */

//1. CopyOnWriteArrayList имплементирует интерфейс List
//2. CopyOnWriteArrayList используется когда необходима потокобезопасность, у вас большое кол-во операций на их чтение и небольшое кол-во операций на изменение.

public class _24_CopyOnWriteArrayList {
    public static void main(String[] args) throws InterruptedException {
        //ArrayList<String> list = new ArrayList<>(); //было
        CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
        list.add("Zaur");
        list.add("Oleg");
        list.add("Sergey");
        list.add("Ivan");
        list.add("Igor");

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
