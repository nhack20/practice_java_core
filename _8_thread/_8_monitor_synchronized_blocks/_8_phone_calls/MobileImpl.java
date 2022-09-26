package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._8_monitor_synchronized_blocks._8_phone_calls;

public class MobileImpl implements Runnable {
    @Override
    public void run() {
        new _8_PhoneCalls().mobileCall();
    }
}
