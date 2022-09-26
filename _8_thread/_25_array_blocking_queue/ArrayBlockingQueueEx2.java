package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._25_array_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
           int i = 0;
           while (true) {
               try {
                   arrayBlockingQueue.put(++i);
                   System.out.println("Producer dobavil: " + i + " " + arrayBlockingQueue);
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer zabral: " + j + " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //console
        //Producer dobavil: 1 []
        //Consumer zabral: 1 []
        //Producer dobavil: 2 [2]
        //Producer dobavil: 3 [2, 3]
        //Consumer zabral: 2 [3]
        //Producer dobavil: 4 [3, 4]
        //Producer dobavil: 5 [3, 4, 5]
        //Producer dobavil: 6 [3, 4, 5, 6]
        //Consumer zabral: 3 [4, 5, 6]
        //Producer dobavil: 7 [4, 5, 6, 7]
        //Consumer zabral: 4 [5, 6, 7]
        //Producer dobavil: 8 [5, 6, 7, 8]
        //Consumer zabral: 5 [6, 7, 8]
        //Producer dobavil: 9 [6, 7, 8, 9]
        //Consumer zabral: 6 [7, 8, 9]
        //Producer dobavil: 10 [7, 8, 9, 10]
    }
}
