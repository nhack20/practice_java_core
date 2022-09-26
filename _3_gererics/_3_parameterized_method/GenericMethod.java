package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._3_parameterized_method;

import java.util.ArrayList;

public class GenericMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
