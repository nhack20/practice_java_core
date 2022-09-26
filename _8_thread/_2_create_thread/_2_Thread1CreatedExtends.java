package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._2_create_thread;

public class _2_Thread1CreatedExtends extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("thr1: " + i);
        }
    }
}
