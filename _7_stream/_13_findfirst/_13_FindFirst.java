package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._13_findfirst;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 13. Метод findFirst
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//findFirst(t) - возвращает первый элемент стрима

public class _13_FindFirst {
    public static void main(String[] args) {
        Optional<Integer> optNum = Stream.of(5, 4, 3, 1, 1).findFirst();
        if (optNum.isPresent()) {
            System.out.println(optNum.get());
        } else {
            System.out.println("Number not found");
        }
    }
}
