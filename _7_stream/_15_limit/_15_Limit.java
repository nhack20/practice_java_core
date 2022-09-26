package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._15_limit;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * = Папка 7. Streams =
 * ---> Урок 15. Метод limit
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//limit(i) - ограничивает кол-во элементов в стриме

public class _15_Limit {
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

        students.stream()
                .filter(e -> e.getAge() > 20)
                .limit(3)
                .forEach(System.out::println);
    }
}
