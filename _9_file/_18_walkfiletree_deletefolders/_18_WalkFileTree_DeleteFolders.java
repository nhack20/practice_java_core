package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._18_walkfiletree_deletefolders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 18. Метод walkFileTree. Удаление директории
 * @author Sergei Begletsov
 * @version 1
 * @since 11.10.2021
 */

public class _18_WalkFileTree_DeleteFolders {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\#Черный пояс\\+5. Nested классы");
        Files.walkFileTree(path, new _18_MyFileVisitor_Delete());
        System.out.println("18 Delete folder with files complete");

        //log console:
        //Delete file: 1. Введение в Nested классы.mp4
        //Delete file: Информация.pdf
        //Delete directory: 111
        //Delete file: 2. Static Nested класс.mp4
        //Delete directory: 222
        //Delete file: 3. Inner класс.mp4
        //Delete file: 4. Local Inner класс.mp4
        //Delete file: 5. Anonymous класс.mp4
        //Delete directory: +5. Nested классы
        //18 Delete folder with files complete
    }
}
