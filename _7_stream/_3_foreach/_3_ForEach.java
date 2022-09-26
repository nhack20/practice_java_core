package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._3_foreach;

import java.util.Arrays;

/**
 * = Папка 7. Streams =
 * ---> Урок 3. Метод forEach
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _3_ForEach {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 10};
        Arrays.stream(array).forEach(el -> {el *= 2 ;
            System.out.println(el);});
        //Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(ExampleForEach::printMethod);
    }
}
