package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._9_randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 9. Класс RandomAccessFile
 * @author Sergei Begletsov
 * @version 1
 * @since 09.10.2021
 */

//1. Иногда надо записать данные в файл в серидину или его конец, или прочитать отрывок из конца большого файла
//2. С помощью RandomAccessFile можно писать в любое место файла, читать из него, а также читать и писать одновременно.
//3. Чтение и запись происходит в том месте, где стоит курсор. При чтении и записи курсор автоматически сдвигается.
//4. RandomAccessFile file = new RandomAccessFile("path_to_file", "rw")

public class _9_RandomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("C:/work_with_file/file9.txt", "rw")) {
            String str = file.readLine(); //прочитать 1 байт
            System.out.println(str);
            file.seek(31); //перемещение указателя на позицию 31
            System.out.println(file.readLine());
            System.out.println("file pointer: " + file.getFilePointer());

            //Запись в начало файла
            //file.seek(0);
            //file.writeBytes("hello_from_java8\n");

            //Запись в конец файла
            file.seek(file.length() - 1);
            file.writeChars("\n\t\t\t09.10.21");
            file.close();
            System.out.println("Done 9!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
