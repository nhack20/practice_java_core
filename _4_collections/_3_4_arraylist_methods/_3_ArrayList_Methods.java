package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._3_4_arraylist_methods;

import java.util.ArrayList;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 3. Методы ArrayList. Часть 1
 * @author Sergei Begletsov
 * @since 25.10.2021
 * @version 2
 */

//Методы ArrayList:
//1. add(DataType element)  boolean
//   add(int index, DataType element)  boolean
//2. get(int index)  DataType
//3. set(int index, DataType element)  DataType
//4. remove(Object element)  boolean
//   remove(int index)  DataType

public class _3_ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(0, "Sergey");
        //Пример 1 - вывод содержимого листа на консоль
        System.out.println("Пример 1:" + arrayList1);
        //Пример 2 - вывод содержимого листа на консоль
        for (String str: arrayList1) {
            System.out.print(str + " ");
        }
        System.out.println();
        //Пример 3 - работа с методом get
        System.out.println("get element with index 2: " + arrayList1.get(2));
        //Пример 4 - работа с методом set
        arrayList1.set(0, "Misha");
        System.out.println("Пример 4:" + arrayList1);
        //Пример 5 - работа с методом remove
        arrayList1.remove("Zaur");
        arrayList1.remove(0);
        System.out.println("Пример 5: " + arrayList1);
        //Пример 6 - работа с данными Студентов
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.1);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.4);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println("Пример 6: " + studentList);
        Student st6 = new Student("Marya", 'f', 23, 3, 9.4);
        studentList.remove(st6);
        System.out.println("Пример 7: " + studentList);
    }
}
