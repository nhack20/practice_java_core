package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._13_interrupted_thread;

public class InterruptedThread extends Thread {
    private double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток sqrt хотят прервать!");
                System.out.println("Мы убедились, что состояние всех объектов нормальное" +
                                    " и решили звершить работу потока");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("IEx: поток хотят прервать во время сна!");
                //e.printStackTrace();
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
