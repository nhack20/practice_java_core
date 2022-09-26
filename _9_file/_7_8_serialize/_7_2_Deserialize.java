package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._7_8_serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class _7_2_Deserialize {
    public static void main(String[] args) {
        List<String> deserialize = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\serialize_list_employees.bin"))) {
            deserialize = (ArrayList) objectInputStream.readObject();
            System.out.println("7.2 deserialize list: " + deserialize);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
