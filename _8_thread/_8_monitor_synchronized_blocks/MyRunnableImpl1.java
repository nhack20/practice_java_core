package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._8_monitor_synchronized_blocks;

public class MyRunnableImpl1 implements Runnable {
    private void doWork() {
        System.out.println("Uraaa!!!");
    }

    //1 Вариант - синхронизированный метод
    /*
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    */

    //2 Вариант - синхронизированный блок
    private void increment() {
        doWork();
        //объект, чей монитор будет использоваться для синхронизации - this
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
