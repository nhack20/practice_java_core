package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._3_try_with_resources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 3. Try with resources
 * @author Sergei Begletsov
 * @since 08.10.2021
 * @version 1
 */

public class _3_TryWithResources {
    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "hello!\n";

        try (FileWriter fileWriter = new FileWriter("F:\\_1_Example_FileWriter.txt", true);
             FileReader fileReader = new FileReader("F://_1_Example_FileWriter.txt");) {   //файл дозаписывается
            fileWriter.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
