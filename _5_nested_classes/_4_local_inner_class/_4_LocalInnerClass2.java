package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._4_local_inner_class;

public class _4_LocalInnerClass2 {
    public static void main(String[] args) {
        class Slojenie implements LocalMath2 {

            @Override
            public int sumOperation(int a, int b) {
                return a + b;
            }
        }

        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.sumOperation(5, 3));
    }
}

interface LocalMath2 {
    public int sumOperation(int a, int b);
}
