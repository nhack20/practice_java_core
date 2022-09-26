package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._2_interf_Comparator;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._1_interf_Comparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Раздел 2. Интерфейсы Comparable и Comparator
 * Урок 2. Интерфейс Comparator
 * @author Sergei Begletsov
 * @since 01.10.2021
 * @version 1
 */

public class _2_Comparator {
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
        System.out.println("2. После сортировки list через компаратор SalaryComparatorAsc по-возрастанию:");
        Collections.sort(list, new  SalaryComparatorAsc());
        System.out.println(list);
        System.out.println("3. После сортировки list через свой компаратор по Id по-возрастанию:");
        Collections.sort(list, Comparator.comparingInt(Employee::getInnerId));
        System.out.println(list);
        System.out.println("4. После сортировки list через компаратор NameComparator по-возрастанию:");
        Collections.sort(list, new  NameComparator());
        System.out.println(list);
        System.out.println("5. После сортировки list через компаратор NameComparator и после SurnameComparator по-возрастанию:");
        Collections.sort(list, new  SurnameComparator().thenComparing(new NameComparator()));
        System.out.println(list);
    }
}
