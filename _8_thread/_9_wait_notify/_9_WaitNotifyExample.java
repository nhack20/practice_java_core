package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._9_wait_notify;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 9. Методы wait и notify
 * @author Sergei Begletsov
 * @version 1
 * @since 15.10.2021
 */

//Методы wait и notify
//1. Для извещения потоком других потоков о своих действиях часто используются след. методы:
// - wait - ОСВОБОЖДАЕТ монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не вызовет метод notify();
// - notify - НЕ ОСВОБОЖДАЕТ монитор и будит поток, у которого ранее был вызван метод wait();
// - notifyAll - НЕ ОСВОБОЖДАЕТ монитор и будит все потоки, у которых ранее был вызван метод wait();

public class _9_WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Client client = new Client(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(client);
        thread1.start();
        thread2.start();
    }
}
