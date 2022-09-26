package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._2_filter;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * = Папка 7. Streams =
 * ---> Урок 2. Метод filter
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _2_Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.1);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream()
                .filter(el -> el.getAge() > 22 && el.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(students);

        Stream<Student> studentStream = Stream.of(st1, st2, st3, st4, st5);
        studentStream.filter(st -> st.getAge() > 20)
                    .collect(Collectors.toSet());
    }
}
