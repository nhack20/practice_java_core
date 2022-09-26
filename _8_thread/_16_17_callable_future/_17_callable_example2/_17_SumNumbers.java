package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_17_callable_future._17_callable_example2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _17_SumNumbers {
    private static long value = 1_000_000_000L;
    private static long summa = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureList = new ArrayList<>();
        long valueDividedBy10 = value/10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            ChastSummi task = new ChastSummi(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureList.add(futurePartSum);
        }
        for (Future<Long> futureValue: futureList) {
            summa += futureValue.get();
        }
        executorService.shutdown();
        System.out.println("futureList summa = " + summa);
    }
}
