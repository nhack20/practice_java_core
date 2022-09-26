package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._14_15_path_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 15. Интерфейс Path и класс Files. Часть 2
 * @author Sergei Begletsov
 * @version 1
 * @since 10.10.2021
 */

public class _15_FilesCopyMoveDelete {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text1.txt");
        Path directoryPath = Paths.get("C:/work_with_file");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
            System.out.println(filePath + " created!");
        }

        //Files.copy(filePath, directoryPath.resolve(filePath));
        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING); //если такой файл уже есть - его надо заменить
        //Files.copy(filePath, directoryPath.resolve("test11.txt"));

        //Files.move(filePath, directoryPath.resolve("text1_new.txt")); //перемещение
        //Files.move(Paths.get("testX10.txt"), Paths.get("testX101.txt")); //переименование

        //Files.delete(directoryPath.resolve("file2bad.txt")); //удаление файла
        System.out.println("Done 15");
    }
}
