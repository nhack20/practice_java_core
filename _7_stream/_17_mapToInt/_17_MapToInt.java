package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._17_mapToInt;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * = Папка 7. Streams =
 * ---> Урок 17. Метод mapToInt
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//mapToInt(i) - отпускает после себя стрим Int
//boxed() - преобразуем int -> в Int

public class _17_MapToInt {
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

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream()
                .mapToInt(el -> el.getCourse())
                .sum();
        System.out.println("sum courses = " + sum);

        int min = students.stream()
                .mapToInt(el -> el.getCourse())
                .min()
                .getAsInt();
        System.out.println("min courses = " + min);

        int max = students.stream()
                .mapToInt(el -> el.getCourse())
                .max()
                .getAsInt();
        System.out.println("max courses = " + max);
    }
}
