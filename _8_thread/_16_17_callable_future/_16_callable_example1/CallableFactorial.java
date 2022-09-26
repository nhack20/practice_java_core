package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_17_callable_future._16_callable_example1;

import java.util.concurrent.Callable;

public class CallableFactorial implements Callable<Integer> {
    int f;

    public CallableFactorial (int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Callcable exeption - illegal. Nevernoe choslo - vvedite zanavo. ");
        }
        int rsl = 1;
        for (int i = 1; i <= f; i++) {
            rsl *= i;
            Thread.sleep(1000);
        }
        return rsl;
    }
}
