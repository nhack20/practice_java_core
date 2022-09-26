package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._9_count;

import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 9. Метод count
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

//count(t) - возвращает количество элементов стрима

public class _9_Count {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("count elements stream: " + stream1.count());
    }
}
