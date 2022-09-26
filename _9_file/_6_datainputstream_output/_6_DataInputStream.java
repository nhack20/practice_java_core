package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._6_datainputstream_output;

import java.io.*;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 6. DataInputStream и DataOutputStream
 * @author Sergei Begletsov
 * @version 1
 * @since 08.10.2021
 */

//<< DataInputStream и DataOutputStream >>
//1. DataInputStream и DataOutputStream позволяют записывать в файл и читать из него примитивные типы данных
//2. DataInputStream inputStream = new DataInputStream(new FileInputStream("test1.bin"));
//3. DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("test2.bin"));

public class _6_DataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("F:\\_6_Example_WriteReadPrimitiveData.bin"));
             DataInputStream inputStream = new DataInputStream(
                new FileInputStream("F:\\_6_Example_WriteReadPrimitiveData.bin"));) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1000000000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(123.456);

            boolean bl = inputStream.readBoolean();
            byte bt = inputStream.readByte();
            short sh = inputStream.readShort();
            int in = inputStream.readInt();
            long lg = inputStream.readLong();
            float fl = inputStream.readFloat();
            double db = inputStream.readDouble();
            System.out.println("boolean: " + bl);
            System.out.println("byte: " + bt);
            System.out.println("short: " + sh);
            System.out.println("int: " + in);
            System.out.println("long: " + lg);
            System.out.println("float: " + fl);
            System.out.println("double: " + db);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
