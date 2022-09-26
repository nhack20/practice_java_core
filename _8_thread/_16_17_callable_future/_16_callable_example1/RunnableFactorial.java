package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_17_callable_future._16_callable_example1;

public class RunnableFactorial implements Runnable {
    int f;

    public RunnableFactorial (int f) {
        this.f = f;
    }

    //метод run() не может выбрасывать исключение
    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Введено неверное число!");
            return;
        }
        int rsl = 1;
        for (int i = 1; i <= f; i++) {
            rsl *= i;
        }
        Factorial.factorialResult = rsl;
    }
}
