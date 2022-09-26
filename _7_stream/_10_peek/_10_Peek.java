package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._10_peek;

import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 10. Метод peak
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//peek(i) - вывод промежуточных результатов, исп. для отладки

public class _10_Peek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 5, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
