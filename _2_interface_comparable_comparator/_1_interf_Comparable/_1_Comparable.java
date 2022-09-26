package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._1_interf_Comparable;

import java.util.*;
import java.util.stream.Stream;

/**
 * Раздел 2. Интерфейсы Comparable и Comparator
 * Урок 1. Интерфейс Comparable
 * @author Sergei Begletsov
 * @since 30.09.2021
 * @version 1
 */

public class _1_Comparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Zaur", "Tregulov", 100000);
        Employee emp2 = new Employee("Ivan", "Petrov", 45000);
        Employee emp3 = new Employee("Ivan", "Sidorov", 80000);
        Employee emp4 = new Employee("Vlad", "Kozlov", 68000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("1. Перед сортировкой list:");
        System.out.println(list);
        System.out.println("2. После сортировки list, реализация метода compareTo() в классе Employee (по полю salary):");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("3. После сортировки list (по полю surname) через анонимный класс:");
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getSurname().compareTo(emp2.getSurname());
            }
        });
        System.out.println(list);
        System.out.println("4. После сортировки list (по полю name) через лямбда:");
        Collections.sort(list, (worker1, worker2) -> worker1.getName().compareTo(worker2.getName()));
        System.out.println(list);
        System.out.println();

        Employee[] massEmp = new Employee[] {emp1, emp3, emp2, emp4};
        System.out.println("5. Перед сортировкой массива:");
        Stream.of(massEmp).forEach(System.out::print);
        System.out.println("6. После сортировки массива:");
        Arrays.sort(massEmp);
        Stream.of(massEmp).forEach(System.out::print);
    }
}
