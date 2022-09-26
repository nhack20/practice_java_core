package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._8_listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * = Папка 4. Коллекции =
 * ---> Урок 8. ListIterator
 * @author Sergei Begletsov
 * @since 30.10.2021
 * @version 1
 */

//1. ListIterator<DataType> listIter = aL.listIterator();
//   while (listIter.hasNext()) //шагает вперед итератор
//   { System.out.println(listIter.next()); }
//2. while (listIter.hasPrevious()) //шагает назад итератор
//   { System.out.println(listIter.previous()); }

public class _8_ListIterator {
    public static void main(String[] args) {
        String s = "МАДАМ";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            char chIter = iterator.next();
            char chRevIter = reverseIterator.previous();
            if (chIter != chRevIter) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("isPalindrome: " + isPalindrome);
    }
}
