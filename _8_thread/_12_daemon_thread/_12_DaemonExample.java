package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._12_daemon_thread;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 12. Daemon потоки
 * @author Sergei Begletsov
 * @version 1
 * @since 16.10.2021
 */

//1. Daemon потоки предназначены для выполнения фоновых задач (бэк-граунд заданий) и оказания различных сервисов User потокам
//2. При завершении работы последнего User-потока программа завершает свое выполнение, не дожидаясь окончания работы Daemon-потоков.
//3. Чтобы сделать поток демоном - надо вызвать метод setDaemon (true) после создания, но перед запуском.

public class _12_DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread user = new UserThread();
        user.setName("user_thread");
        DaemonThread daemon = new DaemonThread();
        daemon.setName("daemon_thread");
        daemon.setDaemon(true);
        user.start();
        daemon.start();
        System.out.println("Main thread ends");

        //console:
        //Main thread starts
        //Main thread ends
        //user_thread is daemon: false
        //daemon_thread is daemon: true
        //_D: 1
        //_D: 2
        //_U: A
        //_D: 3
        //_D: 4
        //_D: 5
        //_U: B
        //_D: 6
        //_D: 7
        //_D: 8
        //_U: C
        //_D: 9
        //_D: 10
        //_D: 11
        //_U: D
        //_D: 12
        //_D: 13
        //_D: 14
        //_U: E
        //_D: 15
        //_D: 16
        //_D: 17
        //_U: F
    }
}
