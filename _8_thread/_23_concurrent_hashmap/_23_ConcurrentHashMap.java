package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._23_concurrent_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 23. ConcurrentHashMap
 * @author Sergei Begletsov
 * @version 1
 * @since 20.10.2021
 */

//1. ConcurrentHashMap имплементирует интерфейс ConcurrentMap, который происходит от интерфейса Map
//2. Любой поток может работать с бакетом hashmap'ы, например 16 ячеек hashmap может обрабатывать 16 потоков независимых.
//3. В ConcurrentHashMap любое кол-во потоков может читать не блокируя его
//4. В ConcurrentHashMap благодаря сегментированию, при изменении какого-либо элемента блокируется только bucket, в котором он находится.
//5. В Synchronize.hashmap если любой поток изменял 1 бакет hashmap то вся коллекция была бы заблокирована.
//6. В ConcurrentHashMap ни key, ни value не могу быть null

public class _23_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        //HashMap<Integer, String> map = new HashMap<>(); //было
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); //было
        map.put(1, "Zaur");
        map.put(2, "Oleg");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ": " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map); //Exception in thread "Thread-0" java.util.ConcurrentModificationException
    }
}
