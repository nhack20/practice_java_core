package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._25_array_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 25. ArrayBlockingQueue
 * @author Sergei Begletsov
 * @version 1
 * @since 21.10.2021
 */

//1. ArrayBlockingQueue - потокобезопасная очередь с ограниченным размером (capacity restricted)
//2. Обычно один или несолько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из начала очереди.
//3. Методы:
//3.1 put - кладет элемент в очередь
//3.2 take - берет элемент из очереди

public class _25_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //queue.add(5); //java.lang.IllegalStateException: Queue full
        queue.offer(5); //ошибки не будет, как и элемент не добавится
        System.out.println(queue);
    }
}
