package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro;

public class OtherExampleLambda {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
    }
}

interface I {
    int abc(String s);
}
