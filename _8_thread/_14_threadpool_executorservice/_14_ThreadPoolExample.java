package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._14_threadpool_executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 14. ThreadPool и ExecutorService. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 17.10.2021
 */

//1. Thread pool - множество потоков, каждый из которых предназначен для выполнения той или иной задачи.
//2. В java с  thread-pool'ами удобнее работать через ExecutorService
//3. Thread pool создается через factory методы класса Executors
//   Executors.newFixedThreadPool(int count) - пул с 5 потоками
//   Executors.newSingleThreadExecutor - пул с 1 потоком
//4. Методы:
//   - execute передает наше задание (task) в thread pool, где оно выполняется одним из потоков
//   - awaitTermination принуждает поток в котором он вызвался подождать до тех пор, пока не выполнится одно из 2х событий:
//     либо ExecutorService прекратит свою работу, либо пройдет время, указанное в пар-ре метода awaitTermination
//5. После выполнения метода shutdown ExecutorService понимает, что новых заданий больше не будет и, выполнив поступившие
//   до этого задания, прекращает работу

public class _14_ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        executorService.shutdown();
        executorService.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}
