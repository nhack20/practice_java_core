package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._1_3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 3. RegEx. Часть 3
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */

public class _3_RegEx {
    public static void main(String[] args) {
        System.out.println("Пример 1. Поиск всех слов в строке");
        String s =
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                        "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                        "Petrova Maryia, Ukraine, Kiew, Lomonosov street, 33, Flat 18, " +
                        "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                        "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21, " +
                        "email: chuck@gmail.com, Postcode: USA23, Phone Number: +123123123;";
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher1 = pattern1.matcher(s);

        while (matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + "    " + matcher1.group());
            //Position: 0    Ivanov
            //Position: 7    Vasiliy
            //Position: 16    Russia
            //Position: 24    Moscow
            //Position: 32    Lenin
            //...
        }
        System.out.println();

        System.out.println("Пример 2. Поиск всех адресов");
        Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b"); // \\b - граница слова
        Matcher matcher2 = pattern2.matcher(s);

        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + ", word: " + matcher2.group());
            //Position: 46, word: 51
            //Position: 55, word: 48
            //Position: 173, word: 33
            //Position: 182, word: 18
            //Position: 300, word: 87
            //Position: 309, word: 21
        }
        System.out.println();

        System.out.println("Пример 3. Поиск всех телефонов");
        Pattern pattern3 = Pattern.compile("\\+\\d{9}");
        Matcher matcher3 = pattern3.matcher(s);

        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + ", word: " + matcher3.group());
            //Position: 113, word: +123456789
            //Position: 241, word: +987654321
            //Position: 368, word: +123123123
        }
        System.out.println();

        System.out.println("Пример 4. Поиск всех email");
        Pattern pattern4 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher4 = pattern4.matcher(s);

        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + ", word: " + matcher4.group());
            //Position: 113, word: +123456789
            //Position: 241, word: +987654321
            //Position: 368, word: +123123123
        }
        System.out.println();
    }
}
