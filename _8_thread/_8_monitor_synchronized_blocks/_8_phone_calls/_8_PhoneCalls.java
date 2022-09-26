package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._8_monitor_synchronized_blocks._8_phone_calls;

public class _8_PhoneCalls {
    //Синхронизация по одному общему объекту Object
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatsappCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Whats'app call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whats'app call ends");
        }
    }

    public static void main(String[] args) {
        //1 Вариант - несинхронно работают методы, тк объекты разные
        System.out.println("Primer1: ");
        Thread thread1mobile = new Thread(new MobileImpl());
        Thread thread2skype = new Thread(new SkypeImpl());
        Thread thread3whatsapp = new Thread(new WhatsappImpl());
        thread1mobile.start();
        thread2skype.start();
        thread3whatsapp.start();

        //2 Вариант - синхронно работают методы, тк объект один
        //Используем монимтор для синхронизации одного и того же объекта
        System.out.println("Primer2: ");
    }
}
