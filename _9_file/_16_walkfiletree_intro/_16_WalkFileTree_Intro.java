package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._16_walkfiletree_intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 16. Введение в метод walkFileTree
 * @author Sergei Begletsov
 * @version 1
 * @since 11.10.2021
 */

//1. Метод Files.walkFileTree(Path path, FileVisitor visitor) используется для обхода дерева файлов
//2. Логика обхода дерева файлов заключается в классе, имплементирующем интерфейс FileVisitor
//3. - preVisitDirectory - срабатывает перед обращением к элементам папки
//   - visitFile - срабатывает при обращении к файлу
//   - postVisitDirectory - после обращения ко всем элементам папки
//   - visitFileFailed - срабатывает когда файл по каким-то причинам недоступен
//4. Используется еще SimpleFileVisitor, который имплементирует все 4 метода, если нам нужно переопределить только 1

public class _16_WalkFileTree_Intro {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Sergei\\Desktop\\1111 Java");
        Files.walkFileTree(path, new _16_MyFileVisitor());
    }
}
