package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._11_lock_reentrantlock._11_bankomat_example;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " ждет...");
//            lock.lock();
                System.out.println(name + " пользуется банкоматом...");
                Thread.sleep(2000);
                System.out.println(name + " заершил пользование банкоматом...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}
