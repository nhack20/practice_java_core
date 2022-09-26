package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._10_deadlock_livelock_starvation;

public class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock2");
        synchronized (_10_DeadLockExample.lock2) {
            System.out.println("Thread20: Монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock1");
            synchronized (_10_DeadLockExample.lock1) {
                System.out.println("Thread20: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}
