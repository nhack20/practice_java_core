package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._5_sorted;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * = Папка 7. Streams =
 * ---> Урок 5. Метод sorted
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

public class _5_Sorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 21, 90, 20, 7, 18, 88, 55};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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

        System.out.println("До сортировки по полю age:");
        System.out.println(students);
        System.out.println();
        System.out.println("После сортировки:");
        students = students.stream().sorted((stud1, stud2) ->
                stud1.getAge() - stud2.getAge())
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
