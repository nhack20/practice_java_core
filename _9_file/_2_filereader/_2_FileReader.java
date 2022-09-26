package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._2_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 2. FileReader
 * @author Sergei Begletsov
 * @since 08.10.2021
 * @version 1
 */

//Не забывайте закрывать стримы после использования! Метод close()

public class _2_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("F://_1_Example_FileWriter.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
