package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._14_threadpool_executorservice;

public class RunnableImpl100 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
