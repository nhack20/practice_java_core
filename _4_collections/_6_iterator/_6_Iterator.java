package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._6_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 6. Интерфейс Iterator
 * @author Sergei Begletsov
 * @since 28.10.2021
 * @version 1
 */

// some code
//...
// Iterator<DataType> iter = aL.iterator();
// while (iter.hasNext())
// { System.out.println(iter.next()); }

public class _6_Iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mariya");
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Sergey");
        System.out.println(arrayList1);

        //отличие for-each от iterator'а состоит в том, что в iterator можно удалять элементы
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
