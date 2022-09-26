package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._5_nested_classes._3_inner_class;

/**
 * = 5. Nested классы =
 * ---> Урок 3. Inner класс
 * @author Sergei Begletsov
 * @since 03.10.2021
 * @version 1
 */

public class _3_InnerClass {
    public static void main(String[] args) {
        //Inner class (или non-static class, но его называют иннер классом):
        //1. каждый объект inner-класса всегда завязан на своем внешнем классе. Ассоциируется с объектом внешнего класса
        //2. создавая объект inner класса, нужно перед этим создать объект его внешнего класса
        //3. inner класс может содержать только non-static элементы
        //4. inner класс может обращаться к private полям внешнего класса
        //5. внешний класс может обращаться к private полям inner класса, прежде создав его объект
        //Car car = new Car("black", 4, 300);
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine2 = new Car("yellow", 3).new Engine(222);
        System.out.println(engine2);
    }
}
