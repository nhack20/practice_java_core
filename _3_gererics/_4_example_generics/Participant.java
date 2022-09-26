package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._4_example_generics;

/**
 * Абстрактный класс Participant - участники соревнований
 */

public abstract class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
