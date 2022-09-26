package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._14_15_path_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _15_FilesReadWrite {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text1.txt");
        Path directoryPath = Paths.get("C:/work_with_file");

//        if (!Files.exists(filePath)) {
//            Files.createFile(filePath);
//        }
//        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Vrode good\n";
//
//        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        list.stream().forEach(System.out::println);
        System.out.println("Done 15 - write String at file");
    }
}
