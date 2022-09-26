package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._12_daemon_thread;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println("_D: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
