package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro;

public class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}
