package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._12_channel_and_buffer_write_to_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 12. Channel и Buffer. Запись в файл
 * @author Sergei Begletsov
 * @version 1
 * @since 09.10.2021
 */

public class _12_ChannelAndBuffer_WriteFile {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("C:/work_with_file/file9.txt", "rw");
             FileChannel channel = file.getChannel()) {
            String text = "A man’s character may be learned from the adjectives which he habitually uses in conversation";
            //Создание буфера 2 вариантами:
            //1 Вариант
            //ByteBuffer buffer = ByteBuffer.allocate(text.getBytes().length);
/*
            buffer.put(text.getBytes());
            buffer.flip();
            channel.position(file.length()); // запись в конец файла
            channel.write(buffer);
*/
            //2 Вариант
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes()); // метод wrap упрощает работу и = allocate (указывает размер буфера), put (кладет в буфер) и flip (кувырок, чтобы position изменить на 0)
            channel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
