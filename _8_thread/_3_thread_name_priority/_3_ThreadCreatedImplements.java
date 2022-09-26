package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._3_thread_name_priority;

//Запускать потоки надо только через метод start()

public class _3_ThreadCreatedImplements implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run(). Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new  _3_ThreadCreatedImplements());
        thread.start();
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
}
