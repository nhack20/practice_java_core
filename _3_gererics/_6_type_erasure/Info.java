package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._6_type_erasure;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
