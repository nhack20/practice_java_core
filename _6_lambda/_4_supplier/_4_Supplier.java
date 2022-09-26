package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._4_supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 4. Supplier
 * @author Sergei Begletsov
 * @since 05.10.2021
 * @version 1
 */

//Supplier<T> - поставщик, у  него есть метод: T get();

public class _4_Supplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<Car> ourCars = createThreeCars( () ->
                new Car("Nissan Tida", "silver", 1.6));
        System.out.println("our cars: " + ourCars);
    }
}
