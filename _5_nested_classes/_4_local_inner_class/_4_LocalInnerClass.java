package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._4_local_inner_class;

/**
 * = 5. Nested классы =
 * ---> Урок 4. Local Inner класс
 * @author Sergei Begletsov
 * @since 03.10.2021
 * @version 1
 */

public class _4_LocalInnerClass {
    public static void main(String[] args) {
        //Local Inner class (класс внутри метода, конструктора):
        //1. local inner класс распологается в блоках кода таких как: метод или конструктор
        //2. local inner класс не может быть static
        //3. область видимости local inner класс - блок, в котором он находится
        //4. local inner класс может обращаться к private полям внешнего класса
        //5. local inner класс может обращаться к элементам блока, в котором он написан при условии, что они final или effectively final
        System.out.println("Delim 21 na 4:");
        LocalMath localMath = new LocalMath();
        localMath.getResult();
        System.out.println();
        System.out.println("Delim 100 na 8:");
        localMath.getResult(100, 8);

        final int a = 10; //a менять нельзя, это константа
        System.out.println(a);
    }
}
