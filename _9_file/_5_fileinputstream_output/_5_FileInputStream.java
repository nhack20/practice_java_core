package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._5_fileinputstream_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 5. FileInputStream и FileOutputStream
 * @author Sergei Begletsov
 * @version 1
 * @since 08.10.2021
 */

//<< FileInputStream и FileOutputStream >>
//1. FileInputStream и FileOutputStream используются для работы с бинарными файлами
//2. FileInputStream input = new FileInputStream("file1.txt");
//3. FileOutputStream output = new FileOutputStream("file2.txt");


public class _5_FileInputStream {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("C:\\Users\\Sergei\\Downloads\\Addams_s01e01_048.jpg");
             FileOutputStream output = new FileOutputStream("F:\\Addams_s01e01_048.jpg")) {
            //1. Перепись бинарного файла побайтно
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
