package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda._1_2_intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 1. Lambda выражения
 * ---> Урок 2. Lambda выражения
 * @author Sergei Begletsov
 * @since 04.10.2021
 * @version 2
 */

    //Lambda expression:
    //1. Самый короткий способ записи лямбда-выражения:
    // stud -> stud.avgGrade > 8.5
    //2. Более полный вариант написания лямбда-выражения:
    // (Student stud) -> {return stud.avgGrade > 8.5;}
    //3. В лямбда выражении оператор стрелка разделяем пар-ры метода и тело метода
    //4. В лямбда выражении справа от оператора стрелка находится тело метода, которое было бы у метода соотв. класса,
    // имплементировавшего наш интерфейс с единственным методом.
    //5. Вы можете использовать смешанный вариант написания лямбда:
    // слева от оператора стрелка писать короткий вариант, справа - полный. Или наоборот.
    //6. Если вы используете полный вариант, то вы должны использовать слово return и знак ";" и "{}"
    //7. Левая часть лямбда выражения м.б. написана в краткой форме, если метод интерфейса принимает только 1 пар-р.
    // Даже если метод интерфейса принимает 1 пар-р, но в лямбда выражении вы хотите описать данный пар-р используя его тип данных,
    // тогда вы должны уже писать левую часть лямбда выражения в скобках.
    //8. Если в правой части лямбда выражения вы пишите более одного statement-а, вы должны исп. его полный вариант написания.

    //Примеры лямбда:
    //П1. Interface I {
    //   int abc();
    //}
    //static void def(I i) {
    //   sout(i.abc);
    //}
    //psvm() {
    //   def(() -> 18);
    //}
    //П2. def( (x) -> x.length() );
    //П3. def( (String x) -> x.length() );
    //П4. def( (x, y) -> x.length() );
    //П5. def( (String x, String  y) -> x.length() );

    //Как нельзя писать лямбда:
    //ПП1. def( (x) -> {x.length();} );
    //ПП2. def( x -> {return x.length()} );
    //ПП3. def( x, y -> x.length() );

    //Еще примеры:
    //ЕП1. method( (int x, int y) -> {int x = 5; return 10;} );  //NOT_OK
    //ЕП2. method( (int x, int y) -> {x = 5; return 10;} );	     //OK
    //ЕП3. method( (int x, int y) -> {int x2 = 5; return 10;} ); //OK

    //Лямбда выражения работают только с интерфейсом, в котором есть только 1 абстрактный метод.
    //Такими интерфейсы назваются фукциональными интерфейсами, т.е. интерфейсами, пригодными для функционального программирования.

public class StudentInfo {

    void testStudents(List<Student> studentList, StudentChecks sc) {
        for (Student student: studentList) {
            if (sc.check(student)) {
                System.out.println(student);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> studentList, double grade) {
//        for (Student student: studentList) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(List<Student> studentList, int age) {
//        for (Student student: studentList) {
//            if (student.age > age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> studentList, int age,  double grade, char sex) {
//        for (Student student: studentList) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.1);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //1. Поиск/сортировка студентов через создание классов
//        StudentInfo info = new StudentInfo();
//        info.printStudentsOverGrade(students, 8.0);
//        System.out.println("------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

        //2. Поиск/сортировка студентов через создание анонимных классов и лямбда-выражениях
        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("------<< anonimous class >>----");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("------<< lambda >>---------");
        info.testStudents(students, (Student p) -> {return p.avgGrade < 8;});
        System.out.println("------------------");
        info.testStudents(students, p -> p.age < 30);
        System.out.println("------------------");
        info.testStudents(students, (Student p) -> {return p.age > 20 && p.avgGrade < 9.5 && p.sex == 'f';});
        System.out.println("------------------");
        StudentChecks scByAge20 = stud -> stud.getAge() > 20;
        info.testStudents(students, scByAge20);
        System.out.println("------------------");

        System.out.println("Сортировка students по полю age:");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.age - student2.age;
            }
        });
        students.stream()
            .forEach(System.out::println);

        System.out.println("Сортировка students по полю course:");
        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
        students.stream()
                .forEach(System.out::println);
    }
}
