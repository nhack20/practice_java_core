package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._15_threadpool_scheduledexecutorservice;

public class RunnableImpl101 implements Runnable {
    static int aaa = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work" + aaa);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work" + aaa);
        aaa++;
    }
}
