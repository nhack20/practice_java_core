package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._6_function;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 6. Function
 * @author Sergei Begletsov
 * @since 05.10.2021
 * @version 1
 */

//Function<T, R> - преобразует/делает над элементами что-то, у  него есть метод: R apply(T t);
//где T - входной пар-р, R - возвращаемый тип

public class _6_Function {

    public static double avgOfSomething(List<Student> list, Function<Student, Double> func) {
        double rsl = 0;
        for (Student student: list) {
            rsl += func.apply(student);
        }
        return rsl / list.size();
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

        Function<Student, Double> functionAvg = st -> st.getAvgGrade();

        System.out.println("Avg grade from all students: " + avgOfSomething(students, functionAvg));
        System.out.println("Avg courses from all students: " + avgOfSomething(students, stud -> (double) stud.getCourse()));
        System.out.println("Avg age from all students: " + avgOfSomething(students, stud -> (double) stud.getAge()));
    }
}
