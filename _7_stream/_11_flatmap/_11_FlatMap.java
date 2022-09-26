package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._11_flatmap;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * = Папка 7. Streams =
 * ---> Урок 11. Метод flatMap
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//flatMap(i) - работает с элементами элементов нашей коллекции

public class _11_FlatMap {
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

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream()
                ).forEach(el -> System.out.println(el.getName()));
    }
}
