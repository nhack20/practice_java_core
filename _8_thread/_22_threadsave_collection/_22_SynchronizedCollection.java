package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._22_threadsave_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 22. Синхронизированные коллекции
 * @author Sergei Begletsov
 * @version 1
 * @since 19.10.2021
 */

// << Синхронизированные коллекции >>, варианты:
//1. Synchronized collection - получаются из традиционных благодаря их обертыванию.
//   Примеры: Collections.synchronized List,Set( коллекция )
//   Потокобезопасность в данном случае получается благодаря тому, что используют lock через synchronized-блоки для всех методов.
//2. Concurrent collections - созданы для работы с многопоточностью
//   Скорость работы с Concurrent-коллекциями значительно выше чем с Synchronized.
//3. Пока доступ к коллекции закрыт (lock) ни один из потоков не может работать с коллекцией
//   Когда доступ откроется - поток добавляет все элементы addAll(source) в synchList и лочит все остальные потоки.

public class _22_SynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        //ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchList =
                Collections.synchronizedList(new ArrayList<>());
        //Runnable runnable = () -> {target.addAll(source);};
        Runnable runnable = () -> {synchList.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        //System.out.println(target);
        System.out.println(synchList);
    }
}
