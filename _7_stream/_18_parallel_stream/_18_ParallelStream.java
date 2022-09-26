package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._18_parallel_stream;

import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 18. Parallel Stream
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//Parallel stream - возможность использования нескольких ядер процессора при выполнении каких-либо операций со stream.
//Сделать стрим параллельным можно 2 способами:
//1) list.parallelStream().   ...
//2) Stream<T> s = Strea.of(...);
//   s.parallel

//Пораллельность стримов подходит для агрегированных функций: нахождения min, max, sum.
//И не подходит, когда наши действия над элементами напрямую зависит от очередности.
//В заданиях на деление, где порядок элементов очень сильно влияет на результат нельзя использовать parallel stream
//Параллельность надо исп. когда ОЧЕНЬ много элементов.

public class _18_ParallelStream {
    public static void main(String[] args) {
        Integer sumResult = Stream.of(1, 2, 3, 4, 5)
            .parallel()
            .reduce((acc, elem) -> acc * elem)
            .get();
        System.out.println("sumResult = " + sumResult);

        Double divResult = Stream.of(10.0, 5.0, 1.0, 0.25)
                //.parallel() //для параллельного стима результат будет некорректным!!! 0.5 а д.б. равно 8.
                .reduce((acc, elem) -> acc / elem)
                .get();
        System.out.println("divResult = " + divResult);
    }
}
