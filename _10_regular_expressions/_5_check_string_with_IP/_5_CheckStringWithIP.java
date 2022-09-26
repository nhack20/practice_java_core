package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._5_check_string_with_IP;

import java.util.regex.Pattern;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 5. Пример «Проверка IP»
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */

public class _5_CheckStringWithIP {
    public static void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        //  25[0-5]   |   2[0-4]\d   |   [01]?\d?\d   (\.)         {3}
        //  250-255   |   200-249    |     0-199      точка   повтори 3 раза

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        String ip3 = "250.200.100.05";
        checkIP(ip1);   //true
        checkIP(ip2);   //false
        checkIP(ip3);   //true
    }
}
