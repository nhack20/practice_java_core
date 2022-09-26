package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._6_chaining;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * = Папка 7. Streams =
 * ---> Урок 6. Method chaining
 * @author Sergei Begletsov
 * @since 06.10.2021
 * @version 1
 */

//map(i) - intermediate методы, filter(i), sorted(i)
//forEach(t) - terminal методы, reduce(t)

//Chaining - цепочка вызовов stream
//    Source   -->   Intermediate methods    --> Terminal method ()
// (коллекция, -->  промежут. методы  (lazy) --> конечные, терминальные методы
//   массив)
//Промежуточные методы получают стрим и возвращают на выходе тоже стрим! Таких цепочек промежуточных может быть много.
//Но эти промежуточные методы не мб исполнены пока не вызвана терминальная операция-метод
//Промежуточные методы (lazy) не сработают пока что-то не произойдет, в нашем случае это выхов терминального метода.
//Терминальный оператор завершает работу стрима

public class _6_Chaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 21, 90, 20, 7, 18, 88, 55};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array).filter(elem -> elem % 2 == 1)
                .map(el -> {
                    if(el % 3 == 0) {el = el / 3;}
                    return el;
                })
                .reduce((acc, elem) -> acc + elem)
                .getAsInt();
        System.out.println("sum reault: " + result);

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
                .map(stud -> {
                    stud.setName(stud.getName().toUpperCase());
                    return stud;})
                .filter(el -> el.getSex() == 'f')
                .sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);
    }
}
