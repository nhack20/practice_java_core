package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._7_data_race_synchronized_methods;

public class MyRunnableImpl2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Counter2.increment();
        }
    }
}
