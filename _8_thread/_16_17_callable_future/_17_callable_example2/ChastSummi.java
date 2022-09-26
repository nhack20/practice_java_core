package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_17_callable_future._17_callable_example2;

import java.util.concurrent.Callable;

public class ChastSummi implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public ChastSummi(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
