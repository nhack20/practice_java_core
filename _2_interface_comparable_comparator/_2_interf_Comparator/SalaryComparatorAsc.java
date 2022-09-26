package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._2_interf_Comparator;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._1_interf_Comparable.Employee;

import java.util.Comparator;

public class SalaryComparatorAsc implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        //Вариант 1 - natural order (естеств. порядок)
        if (emp1.getSalary() == emp2.getSalary()) {
            return 0;
        }
        if (emp1.getSalary() < emp2.getSalary()) {
            return -1;
        } else {
            return 1;
        }
    }
}
