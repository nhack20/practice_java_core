package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._5_anonimous_inner_class;

/**
 * = 5. Nested классы =
 * ---> Урок 5. Anonymous класс
 * @author Sergei Begletsov
 * @since 03.10.2021
 * @version 1
 */

public class _5_AnonymousInnerClass {
    private int x = 5;

    public static void main(String[] args) {
        //Anonymous класс (без имени):
        //1. anonymous класс не имеет имени
        //2. anonymous класс - это объявление класса и одновременное создание объекта
        //3. в анонимных классах невозможно написать конструктор
        //4. анонимный класс может обращаться даже к private полям внешнего класса
        //5. lambda expressions - краткая форма для написания анонимных классов
        Math m = new Math() {
            @Override
            public int sumOperation(int a, int b) {
                return a + b + new _5_AnonymousInnerClass().x;
            }
        };

        System.out.println(m.sumOperation(5, 3));
    }
}

interface Math {
    public int sumOperation(int a, int b);
}