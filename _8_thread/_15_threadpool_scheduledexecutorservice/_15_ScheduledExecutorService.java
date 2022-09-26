package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._15_threadpool_scheduledexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 15. ThreadPool и ExecutorService. Часть 2
 * @author Sergei Begletsov
 * @version 1
 * @since 17.10.2021
 */

//1. ScheduledExecutorService исползуем когда хотим установить расписание на запуск потоков из пула.
//2. Данный pool создается исользуя метод factory у класса ExecutorsЖ
//   Executors.newScheduledThreadPool(int count)

public class _15_ScheduledExecutorService {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl101());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl101(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl101(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(10000);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl101(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("Main ends");
    }
}
