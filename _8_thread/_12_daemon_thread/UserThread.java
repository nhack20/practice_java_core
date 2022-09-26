package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._12_daemon_thread;

public class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char ch = 'A'; ch < 'G'; ch++) {
            try {
                sleep(300);
                System.out.println("_U: " + ch);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
