package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._17_walkfiletree_copyfolders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 17. Метод walkFileTree. Копирование директории
 * @author Sergei Begletsov
 * @version 1
 * @since 11.10.2021
 */

public class _17_WalkFileTree_CopyFolders {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("C:\\Users\\Sergei\\Desktop\\1111 Java");
        Path to = Paths.get("C:\\Users\\Sergei\\Desktop\\2222 Java");
        Files.walkFileTree(from, new _17_MySimpleFileVisitor(from, to));
        System.out.println("17 Copy files and folders done");
    }
}
