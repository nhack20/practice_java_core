package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._4_thread_sleep_join_states;

public class _4_MyExtends1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
