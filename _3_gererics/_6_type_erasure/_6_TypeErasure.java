package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._6_type_erasure;

/**
 * = Папка 3. Generics =
 * ---> Урок 6. Type erasure
 * @author Sergei Begletsov
 * @since 02.10.2021
 * @version 1
 */

public class _6_TypeErasure {
    public static void main(String[] args) {

    }

    public void abc(Info<String> info) {
        String str = info.getValue();
    }

    //нельзя написать public void abc(Info<Integer> info),
    //т.к. компилятор после уничтожения generic сделает метод таким public void abc(Info info),
    //как для 1-го метода, так и для его перегруженного. Для супер-класса и его потомка с переопределенным методом
    //точно такая же тема - компилятор заблокирует код. Не поймет какой метод из 2-х вызывать

    //public void abc(Info<Integer> info) {
    //    Integer integer = info.getValue();
    //}
}
