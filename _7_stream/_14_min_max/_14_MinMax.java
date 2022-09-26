package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._14_min_max;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * = Папка 7. Streams =
 * ---> Урок 14. Методы min и max
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//min(t), max(t) - возвращает min/max элемент найденный после условия сортировки Comparator

public class _14_MinMax {
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

        Student studMin = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("min = " + studMin);

        Student studMan = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("max = " + studMan);
    }
}
