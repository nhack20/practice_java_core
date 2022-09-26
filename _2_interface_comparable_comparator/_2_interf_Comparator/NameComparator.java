package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._2_interf_Comparator;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._1_interf_Comparable.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
