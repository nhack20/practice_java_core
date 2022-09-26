package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._8_distinct;

import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 8. Метод distinct
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

//distinct(i) - возвращает стринг уникальных элементов, а проверяет из с помощью equals

public class _8_Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 3, 5, 5, 1, 1);
        stream1.distinct().forEach(System.out::println);
    }
}
