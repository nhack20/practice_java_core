package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._12_collect_groupingBy_partitioningBy;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * = Папка 7. Streams =
 * ---> Урок 12. Метод collect grouping и partitioning
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//groupingBy - группировка по
//partitioningBy - разделение по

public class _12_Collect {
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

        //1. Пример groupingBy
        Map<Integer, List<Student>> map = students.stream().map(el -> {
                            el.setName(el.getName().toUpperCase());
                            return el;})
                        .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        //2. Пример partitioningBy
        Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
