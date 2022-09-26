package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._3_4_arraylist_methods;

import java.util.ArrayList;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 3. Методы ArrayList. Часть 2
 * @author Sergei Begletsov
 * @since 27.10.2021
 * @version 1
 */

//Методы ArrayList:
//1. addAll(ArrayList aL)  boolean
//   addAll(int index, ArrayList aL)  boolean
//2. clear()  void
//3. indexOf(Object element)  int или -1 если не
//4. lastIndexOf(Object element)  int
//5. size()  int
//6. isEmpty()  boolean
//7. contains(Object element)  boolean
//8. toString()  String

public class _4_ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mariya");
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Sergey");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("???");
        arrayList2.add("###");
        arrayList2.add("!!!");
        System.out.println(arrayList2);
        //Пример 1 - добавление всех элементов
        arrayList1.addAll(arrayList2);
        System.out.println("Пример 1: " + arrayList1);
        //Пример 2 - поиск индекса
        System.out.println("Пример 2: " + arrayList1.indexOf("!!!"));
        //Пример 3 - поиск последнего индекса
        System.out.println("Пример 3: " + arrayList1.lastIndexOf("Mariya"));
        //Пример 4 - размер
        System.out.println("Пример 4: size = " + arrayList2.size());
        //Пример 5 - isEmpty()
        System.out.println("Пример 5: isEmpty() = " + arrayList2.isEmpty());
        arrayList2.clear();
        System.out.println("Пример 5: isEmpty() = " + arrayList2.isEmpty());
        //Пример 6 - contains()
        System.out.println("Пример 6: contains() Nikolay = " + arrayList1.contains("Nikolay"));
        System.out.println("Пример 6: contains() Mariya = " + arrayList1.contains("Mariya"));
    }
}
