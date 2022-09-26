package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._20_exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class BestFriend extends Thread {
    String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
    }

}
