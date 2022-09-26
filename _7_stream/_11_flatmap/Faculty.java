package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._7_stream._11_flatmap;

import ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro.Student;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void setStudentsOnFaculty(List<Student> studentsOnFaculty) {
        this.studentsOnFaculty = studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}
