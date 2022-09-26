package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._2_create_thread;

public class _2_Thread2CreatedImplements implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("thr2: " + i);
        }
    }
}
