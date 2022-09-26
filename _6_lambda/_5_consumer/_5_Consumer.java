package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._5_consumer;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._4_supplier.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 5. Consumer
 * @author Sergei Begletsov
 * @since 05.10.2021
 * @version 1
 */

//Consumer<T> - потребитель, у  него есть метод: void accept(T t);

public class _5_Consumer {
    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> ourCars = Arrays.asList(new Car("nissan", "black", 2.2),
                new Car("hyndai", "white", 1.9),
                new Car("volvo", "green", 1.6));
        System.out.println("До модификации: " + ourCars.get(0));
        changeCar(ourCars.get(0), car -> {
                                    car.setEngine(car.getEngine() + 0.3);
                                    car.setColor("yellow");
            System.out.println("Car upgraded!");
        });
        System.out.println("После: " + ourCars.get(0));

        //разбор forEach
        List<String> list = List.of("privet", "kak dela?", "poka");
        list.forEach(str -> {
            System.out.println(str.toUpperCase());});

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            el *= 2;
            System.out.println(el);
        });
    }
}
