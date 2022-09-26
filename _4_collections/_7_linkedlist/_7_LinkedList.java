package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._7_linkedlist;

import java.util.LinkedList;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 7. LinkedList
 * @author Sergei Begletsov
 * @since 29.10.2021
 * @version 1
 */

//1. Элементы LinkedList – это звенья одной цепочки. Эти элементы хранят определённые данные, а также
//   ссылки на предыдущий и следующий элементы.
//2. Как правило, LinkedList следует использовать когда:
//   1) Невелико количество операций получения элементов;
//   2) Велико количество операций добавления и удаления элементов.
//      Особенно если речь идёт о элементах в начале коллекции.

public class _7_LinkedList {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Marya", 3);
        LinkedList<Student> studentsList = new LinkedList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        System.out.println("LinkedList = " + studentsList);
        System.out.println(studentsList.get(2));
        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("IgorFirst", 4);
        studentsList.add(st6);
        studentsList.add(0, st7);
        System.out.println(studentsList);
        studentsList.remove(0);
        System.out.println(studentsList);
    }
}
