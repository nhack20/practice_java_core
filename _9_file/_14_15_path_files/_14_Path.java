package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._14_15_path_files;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 14. Интерфейс Path и класс Files. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 10.10.2021
 */

//1. Объект типа Path представляет собой путь к файлу или директории
//2. Path path = Paths.get("text1.txt");

public class _14_Path {
    public static void main(String[] args) {
        Path filePath = Paths.get("text1.txt");
        Path directoryPath = Paths.get("J:/file_and_folder_path/subfolder");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("---------------------------");
        System.out.println("filePath.getParent() " + filePath.getParent());  //null
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());  //J:\file_and_folder_path
        System.out.println("---------------------------");
        System.out.println("filePath.getRoot() " + filePath.getRoot());  //null
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());  //J:\
        System.out.println("---------------------------");
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());  //C:\Java_Project\java_experience\text1.txt
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());  //J:\file_and_folder_path\subfolder
        System.out.println("---------------------------");
        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());  //C:\Java_Project\java_experience
        System.out.println("filePath.toAbsolutePath().getRoot() " + filePath.toAbsolutePath().getRoot());  //C:\
        System.out.println("---------------------------");
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));  //J:\file_and_folder_path\subfolder\text1.txt
        System.out.println("---------------------------");
        Path anotherPath = Paths.get("J:/file_and_folder_path/subfolder/new_folder/test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));  //new_folder\test20.txt
    }
}
