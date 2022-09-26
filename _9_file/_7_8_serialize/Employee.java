package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._7_8_serialize;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
//    int age;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department, /*int age,*/ double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        //this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                //", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
