package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._7_concat;

import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 7. Метод concat
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _7_Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream.concat(stream1, stream2).forEach(System.out::println);
    }
}
