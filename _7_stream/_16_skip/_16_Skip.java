package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._16_skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 16. Метод skip
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//skip(i) - пропускает первые n-элементов

public class _16_Skip {
    public static void main(String[] args) {
        List<Integer> integerList = Stream.of(1, 2, 3, 4, 5 ,6, 7, 8, 9, 10)
                .skip(7)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
