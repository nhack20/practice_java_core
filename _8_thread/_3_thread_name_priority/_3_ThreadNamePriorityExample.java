package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._3_thread_name_priority;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 3. Thread name и Thread priority
 * @author Sergei Begletsov
 * @version 1
 * @since 12.10.2021
 */

public class _3_ThreadNamePriorityExample {
    public static void main(String[] args) {
        _3_MyThreadPriority thread0 = new _3_MyThreadPriority();
        System.out.println("thread name(): " + thread0.getName());          //Thread-0
        System.out.println("thread priority(): " + thread0.getPriority());  //5

        thread0.setName("MyThread5");
        thread0.setPriority(6);
        thread0.setPriority(Thread.MAX_PRIORITY);

        System.out.println("thread name(): " + thread0.getName());          //MyThread5
        System.out.println("thread priority(): " + thread0.getPriority());  //6
    }
}
