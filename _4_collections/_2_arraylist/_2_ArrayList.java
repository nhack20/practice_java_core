package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._2_arraylist;

import java.util.ArrayList;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 2. ArrayList
 * @author Sergei Begletsov
 * @since 25.10.2021
 * @version 1
 */

//1. ArrayList - массив, который может изменять свою длину (увеличивать/уменьшать длину когда это нужно)
//2. В основе ArrayList лежит массив Object
//3. Примеры создания листа:
//  ArrayList <DataType> list1 = new ArrayList <DataType> ();
//  ArrayList <DataType> list2 = new ArrayList <> ();
//  ArrayList <DataType> list3 = new ArrayList <> (30);     //30 элементов
//  ArrayList <DataType> list4 = new ArrayList <> (list3);  //другой лист

public class _2_ArrayList {
    public static void main(String[] args) {
        //Примеры 1 создания листа:
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
        System.out.println();

        //Примеры 2 создания листа на 30 элементов:
        ArrayList<String> arrayList2 = new ArrayList<>(30);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        //Примеры 3 через другой лист:
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
    }
}
