package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._2_static_nested_class;

/**
 * = 5. Nested классы =
 * ---> Урок 2. Static Nested класс
 * @author Sergei Begletsov
 * @since 03.10.2021
 * @version 1
 */

public class _2_StaticNestedClass {
    public static void main(String[] args) {
        //Static nested class:
        //1. static nested класс очень похож на обычный внешний, но находится внутри другого класса
        //2. создавая объект static nested класса, нужно указывать и класс содержащий его
        //3. static nested класс может содержать static и non-static элементы
        //4. static nested класс может обращаться даже к private элементам внешнего класса, но только к static
        //5. внешний класс может обращаться даже к private элементам static nested класса и наоборот!
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
