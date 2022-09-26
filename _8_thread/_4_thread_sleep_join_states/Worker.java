package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._4_thread_sleep_join_states;

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }

    public static String getStateThread(Thread.State state) {
        String rsl = "";
        switch (state) {
            case NEW: rsl = "NEW"; break;
            case RUNNABLE: rsl = "RUNNABLE"; break;
            case WAITING: rsl = "WAITING"; break;
            case TIMED_WAITING: rsl = "TIMED_WAITING"; break;
            case BLOCKED: rsl = "BLOCKED"; break;
            case TERMINATED: rsl = "TERMINATED"; break;
        }
        return "State thread: " + rsl;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread worker = new Thread(new Worker());
        System.out.println(getStateThread(worker.getState()));
        worker.start();
        System.out.println(getStateThread(worker.getState()));
        Thread.sleep(500);
        System.out.println(getStateThread(worker.getState()));
        worker.join(3000);
        System.out.println(getStateThread(worker.getState()));
        //Поток Main ждет завершения работы worker. И как только worker завершил работы, то поток Main завершает свою.
        System.out.println("Method main ends");
    }
}
