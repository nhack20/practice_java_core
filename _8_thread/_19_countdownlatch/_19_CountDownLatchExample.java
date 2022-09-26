package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._19_countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 19. Синхронизатор CountDownLatch
 * @author Sergei Begletsov
 * @version 1
 * @since 18.10.2021
 */

//1. CountDownLatch - синхронизатор, позволяющий любому кол-ву потоков ждать пока не завершится определенное кол-во операций.
//   В конструктор CountDownLatch нужно передавать кол-во операций, которые должны завершиться, чтобы потоки продолжили свою работу.
//2. Методы:
// - await - если счетчик countDown > 0 наш поток будет заблокирован до тех пор, пока счетчик не станет равен 0.
//           если счетчик = 0, то наш поток будет беспрепятственно выполнять работу.
// - countDown
// - getCount

public class _19_CountDownLatchExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Все работники пришли в магазин");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everyThingIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Все товары на своих местах");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Давайте откроем магазин!");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Lena", countDownLatch);
        new Friend("Victor", countDownLatch);
        new Friend("Marina", countDownLatch);
        marketStaffOnPlace();
        everyThingIsReady();
        openMarket();
    }
}
