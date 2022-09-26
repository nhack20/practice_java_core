package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._4_string_methods_split_mathes;

import java.util.Arrays;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 4. Методы класса String matches и split
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */

//1. Методы:
//- public boolean matches (String regex),
//- public String [] split (String regex)

public class _4_MatchesAndSplit {
    public static void main(String[] args) {
        String s =
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                        "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                        "Petrova Maryia, Ukraine, Kiew, Lomonosov street, 33, Flat 18, " +
                        "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                        "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21, " +
                        "email: chuck@gmail.com, Postcode: USA23, Phone Number: +123123123;";

        //Пример 2 - Проверка выполняется или нет шаблон
        String s2 = "chuck@gmail.com";
        boolean rsl = s2.matches("\\w+@\\w+\\.(com|ru)"); //true
        System.out.println(rsl);

        //Пример 3 - Разделение строки на массив подстрок
        String[] arrayStr = s.split(", ");
        System.out.println(Arrays.toString(arrayStr));
    }
}
