package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._14_15_path_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class _14_Files {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text1.txt");
        Path directoryPath = Paths.get("J:/file_and_folder_path/subfolder");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)) {
            Files.createFile(directoryPath);
        }
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));  //true
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));  //true
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));  //true
        System.out.println("---------------------------");

        Path filePath2 = Paths.get("C:/Java_Project/java_experience/text1.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));  //true
        System.out.println("Files.size(filePath) " + Files.size(filePath));  //0
        System.out.println("Files.size(filePath2) " + Files.size(filePath2));  //0
        System.out.println("---------------------------");

        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));  //2021-10-10T02:49:04.3086456Z
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));  //0
        System.out.println("---------------------------");

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry: attributes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
