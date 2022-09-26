package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._10_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 10. Класс File
 * @author Sergei Begletsov
 * @version 1
 * @since 09.10.2021
 */

//1. Класс File позволяет управлять информацией о файлах и директориях
//2. Класс File не работает с потоками, его задачей является предоставлять инф. о файлах и каталогах, директориях или папками
//3. В java директории и файлы описываются 1 классом File
//4. File file = new File("file1.txt");

public class _10_File {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/work_with_file/file9.txt");
        File folder = new File("C:/work_with_file");
        File file2bad = new File("C:/work_with_file/file2bad.txt");
        File folder2bad = new File("C:/work_with_file/333_12");

        System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath(): " + folder.getAbsolutePath());
        System.out.println("----------------------------------------------");
        System.out.println("file.isAbsolute(): " + file.isAbsolute());
        System.out.println("folder.isAbsolute(): " + folder.isAbsolute());
        System.out.println("----------------------------------------------");
        System.out.println("file.isDirectory(): " + file.isDirectory());
        System.out.println("folder.isDirectory(): " + folder.isDirectory());
        System.out.println("----------------------------------------------");
        System.out.println("file.exists(): " + file.exists());
        System.out.println("folder.exists(): " + folder.exists());
        System.out.println("file2bad.exists(): " + file2bad.exists());
        System.out.println("folder2bad.exists(): " + folder2bad.exists());
        System.out.println("----------------------------------------------");
        System.out.println("file2bad.createNewFile(): " + file2bad.createNewFile());
        System.out.println("folder2bad.mkdir(): " + folder2bad.mkdir());
        System.out.println("----------------------------------------------");
        System.out.println("file.length(): " + file.length());
        System.out.println("folder.length(): " + folder.length());
        System.out.println("----------------------------------------------");
        File[] files = folder.listFiles();
        System.out.println("folder.listFiles(): " + Arrays.toString(files));
        System.out.println("----------------------------------------------");
        System.out.println("file.canRead(): " + file.canRead());
        System.out.println("file.canWrite(): " + file.canWrite());
    }
}
