package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._7_data_race_synchronized_methods;

public class Counter2 {
    static int counter = 0;
    public static synchronized void increment() {counter++;}
}
