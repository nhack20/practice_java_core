package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._7_data_race_synchronized_methods;

public class MyRunnableImpl1 implements Runnable {
    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
