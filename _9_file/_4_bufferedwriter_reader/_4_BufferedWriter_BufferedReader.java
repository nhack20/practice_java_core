package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._4_bufferedwriter_reader;

import java.io.*;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 4. BufferedWriter и BufferedReader
 * @author Sergei Begletsov
 * @since 08.10.2021
 * @version 1
 */

// << BufferedWriter и BufferedReader >>
//Буферизация - процесс загрузки части файла, происходящее во время потоковой передачи (музыки, фильма) до их воспроизвдения.
//Эта форма буферизация позволяет смотреть или слушать медиа-файлы почти мгновенно, загружая только чать файла,
//Мы можем просматривать фильмы по мере того как буферизация продвигается.
//Буферизация загружает только часть файла.

//1. Использование буферизации в стримах позволяет достичь большей эффективности при чтении файла или записи в него
//2. BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"));
//3. BufferedReader reader = new BufferedReader(new FileReader("file2.txt"));
//4. BufferedWriter, BufferedReader - это обертки. Они оборачивают FileWriter и добавляют функциональность буферизации.
//5. Отличия буферизированного подхода от не:
//5.1 При использовании FileReader обращение к файлу происходит каждый раз при считывании 1го символа (т.е. n-раз)
//5.2 BufferedReader может сократить обращение к файлу до 1 раза (в зависимости от длины буфера). Что делает код более эффективным.

public class _4_BufferedWriter_BufferedReader {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("F://_1_Example_FileWriter.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("F://_4_Example_BufferedFileWriter.txt"));) {

            //1. Чтение/запись файла посимвольно
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            //2. Чтение/запись файла построчно
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
