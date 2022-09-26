package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._4_reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * = Папка 7. Streams =
 * ---> Урок 4. Метод reduce
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

//Метод reduce() - уменьшает/ сокращает все элементы до 1, используется для агрегирования

public class _4_Reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);

        int result = integerList.stream().reduce((acc, elem) -> acc * elem).get();
        System.out.println(result);
        //5, 8, 2, 4, 3
        //accumulator =  5  40  80  320  (960)
        //element =      8   2   4   3

        int result2 = integerList.stream().reduce(1, (acc, elem) -> acc * elem);
        System.out.println(result2);
        //5, 8, 2, 4, 3
        //accumulator =  1   5  40  80  320  960
        //element =      5   8   2   4   3

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        String result3 = list.stream().reduce((acc, elem) -> acc + " " + elem).get();
        System.out.println(result3);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> optResult100 = list100.stream().reduce((acc, elem) -> acc * elem);
        if (optResult100.isPresent()) {
            System.out.println(optResult100.get());
        } else {
            System.out.println("optResult100 = null!");
        }

    }
}
