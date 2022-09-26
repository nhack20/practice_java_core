package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._2_interface_comparable_comparator._1_interf_Comparable;

public class Employee implements Comparable<Employee> {
    private static int id = 1;
    private int innerId;
    private String name;
    private String surname;
    private Integer salary;

    {
        this.innerId = id++;
        System.out.println("obj_id: " + id);
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getInnerId() {
        return innerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "innerId=" + innerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + '\n';
    }

    @Override
    public int compareTo(Employee other) {
        //Вариант 1 - natural order (естеств. порядок)
        if (this.salary == other.salary) {
            return 0;
        }
        if (this.salary < other.salary) {
            return -1;
        } else {
            return 1;
        }
        //Вариант 2
        //return this.salary - other.salary;
        //Вариант 3
        //return Integer.compare(this.salary, other.salary);
        //Вариант 4
        //return this.salary.compareTo(other.salary);
        //return this.name.compareTo(other.name);
    }
}
