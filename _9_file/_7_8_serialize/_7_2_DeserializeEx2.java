package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._7_8_serialize;

import java.io.*;

public class _7_2_DeserializeEx2 {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("F://employees2.bin"))) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
            System.out.println("7.2ex2 Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
