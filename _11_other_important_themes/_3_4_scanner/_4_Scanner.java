package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._11_other_important_themes._3_4_scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * = Папка 11. Другие важные темы =
 * ---> Урок 4. Класс Scanner. Часть 2
 * @author Sergei Begletsov
 * @version 1
 * @since 24.10.2021
 */

public class _4_Scanner {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader("C:\\Users\\Sergei\\Desktop\\text_for_scanner.txt"));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }

            set.stream().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("File have a problem");
        } finally {
            scanner.close();
        }
    }
}
