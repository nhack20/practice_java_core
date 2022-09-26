package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._10_deadlock_livelock_starvation;

public class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (_10_DeadLockExample.lock1) {
            System.out.println("Thread10: Монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (_10_DeadLockExample.lock2) {
                System.out.println("Thread10: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}
