package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._7_8_serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 7. Сериализация. Часть 1,
 * ---> Урок 8. Сериализация. Часть 2
 * @author Sergei Begletsov
 * @version 2
 * @since 09.10.2021
 */

//<< Сериализация и Десериализация >>
//1. Сериализация - преобразование объекта в послед. байт.
//2. Десериализация - процесс восстановления объекта из этих байт.
//3. ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test1.bin"));
//4. ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test2.bin"));

//5. Чтобы объект класса мб сериализовать, класс д. имплементировать интерфейс Serialize
//6. Поля отмеченные КС transient не записываются в файл при сериализации
//7. В сериализируемом классе необходимо использовать serialVersionUID для обозначения версии класса

public class _7_1_Serialize {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("F:\\serialize_list_employees.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("7.1 Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
