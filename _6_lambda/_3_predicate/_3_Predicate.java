package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._3_predicate;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 3. Predicate
 * @author Sergei Begletsov
 * @since 05.10.2021
 * @version 1
 */

public class _3_Predicate {
    static void testStudents(ArrayList<Student> listStudent, Predicate<Student> predicate) {
        for (Student st: listStudent) {
            if (predicate.test(st)) {
                System.out.println(st);
            }
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.1);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Predicate<Student> predicateByAge18 = student -> student.getAge() > 18;
        testStudents(students, predicateByAge18);

        testStudents(students, p -> {
            System.out.println("hello");
            return p.getAvgGrade() > 8;
        });

        testStudents(students, (Student st) -> st.getAge() > 22);

        Predicate<Student> pred1 = student -> student.getAvgGrade() > 7.5;
        Predicate<Student> pred2 = student -> student.getSex() == 'm';
        testStudents(students, pred1.and(pred2));

        testStudents(students, pred1.or(pred2));

        testStudents(students, pred1.negate());
    }
}
