package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._11_channel_and_buffer_read_from_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * = Папка 9. Работа с файлами IO и NIO =
 * ---> Урок 11. Введение в Channel и Buffer. Чтение из файла
 * @author Sergei Begletsov
 * @version 1
 * @since 09.10.2021
 */

//Раздел NIO. Buffer и Channel
//1. Программа --> Buffer --> Channel читает инф. из Buffer и записывает в файл --> write to file
//2. Программа <-- Buffer <-- Channel читает инф. из файла и записывает в Buffer <-- read from file
//3. Channel похожи на Stream из io, но есть отличия:
//3.1 Stream данных работают в одном направлении, либо читаем, либо записываем
//3.2 Channel работают сразу в оба направления. Channel всегда работает с Buffer. Читаем либо записывает инф. в Buffer
//Buffer - блок памяти который мы можем что-то записать, и который мы м. исп. для чтения или записи информации
//Особенность Buffer состоит в том, что мы можем гулять по нему, в том числе по предудущим значениям буфера

//Buffer содержит важные моменты:
//position - текущая позиция (указатель) в файле, максимальная позиция = capacity - 1
//limit = capacity. Максимальное кол-во байт которые мы можем записать в буфер, максимум выделяемой памяти под буфер.
//Но когда мы дошли по конца файла, limit становится равным последнему байту position в файле.
//capacity - размер буфера, объем выделяемой памяти в байтах. Буфер может содержать capacity-байт.

public class _11_ChannelAndBuffer_ReadFile {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("C:/work_with_file/file9.txt", "rw");
             FileChannel channel = file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(20);
            StringBuilder stix = new StringBuilder();

            //1. Читаем инф. из файла и записываем в буфер
            int byteRead = channel.read(buffer);

            while (byteRead > 0) {
                System.out.println("Read " + byteRead + " bytes");
                buffer.flip(); // метод flip меняет режим записи -> на режим чтения
                //2. Делаем кувырок - читаем из буфера и присоединяем ее к StringBuilder по 1 байту
                while (buffer.hasRemaining()) {
                    stix.append((char)buffer.get());
                }
                //3. метод clear переводит позицию на нулевую (0) и начинает запись поверх старых байт
                buffer.clear();
                //4. Читаем инф. из файла и записываем в буфер
                byteRead = channel.read(buffer);
            }
            System.out.println(stix);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
