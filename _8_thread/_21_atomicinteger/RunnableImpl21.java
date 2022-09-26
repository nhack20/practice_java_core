package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._21_atomicinteger;

public class RunnableImpl21 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            _21_AtomicIntegerExample.increment();
        }
    }
}
