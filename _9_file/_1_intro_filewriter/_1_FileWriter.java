package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._1_intro_filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 1. Введение в Стримы. FileWriter
 * @author Sergei Begletsov
 * @since 07.10.2021
 * @version 1
 */

//<< Character Streams and Byte Streams >>
//Stream (поток) для работы с файлами - упорядоченная последовательность данных
//Файлы разделяют на:
// - текстовые (читабельные) для человека - text files;
// - нечитабельные - binary files.
//При работе с текстовыми и бинарными файлами нам надо исп. резные типы стримов

//<< FileReader & FileWriter >>
//FileReader и FileWriter используются для работы с текстовыми файлами

public class _1_FileWriter {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                        "Непонятного нет для меня под луной.\n" +
                        "Мне известно, что ничего не известно!\n" +
                        "Вот последняя правда, открытая мной.\n";
        String s = "hello!\n";

        FileWriter fileWriter = null;
        try {
            //fileWriter = new FileWriter("F:\\_1_Example_FileWriter.txt"); //каждый раз файл перезаписывается
            fileWriter = new FileWriter("F:\\_1_Example_FileWriter.txt", true); //файл дозаписывается
            //fileWriter = new FileWriter("test2.txt"); //появится в корне проекта
            //1 Вариант - запись в файл посимвольно
//            for (int i = 0; i < rubai.length(); i++) {
//                fileWriter.write(rubai.charAt(i));
//            }
            //2 Вариант - сразу всю строку String посимвольно
            fileWriter.write(rubai);
            //fileWriter.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }
}
