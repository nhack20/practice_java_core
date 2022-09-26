package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._1_intro;

/**
 * = 5. Nested классы =
 * ---> Урок 1. Введение в Nested классы
 * @author Sergei Begletsov
 * @since 03.10.2021
 * @version 1
 */

public class _1_IntroNestedClasses {
    //1. Статичные nested-классы
    public static class A {

    }
    //2. Inner классы (внутренний)
    class B{

    }
    //3. Классы внутри метода или какого-либо блока (в т.ч. конструктора). Такой класс называется локальным
    public void method() {
        class C {

        }
    }
    //4. Анонимные классы

    //Nested-классы имеют доступ на переменные outer-класса, даже к private-переменным
}
