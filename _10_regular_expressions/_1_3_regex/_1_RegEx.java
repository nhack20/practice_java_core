package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._1_3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 1. RegEx. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 21.10.2021
 */

//1. Регулярные выражения необходимы для создания шаблонов, с помощью которых производятся такие операции: поиск, сравнение, замена.
//2. Регулярные выражения - совокупность символов, некоторые из которых являются специальными метасимволами (обладают каким-то функционалом)
//3. Создание RegEx:
// Pattern myPattern = Pattern.compile(«REGEX");
// Matcher myMatcher = myPattern .matcher(myString);

public class _1_RegEx {
    public static void main(String[] args) {
        String s =
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Maryia, Ukraine, Kiew, Lomonosov street, 33, Flat 18, " +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21, " +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +123123123;";

        //Пример 2. Поиск подстроки "ABC"
        System.out.println("Пример 2. Поиск подстроки \"ABC\"");
        String str2 = "ABC ABCE ABCFABCGABHABCO";
        Pattern pattern2 = Pattern.compile("ABC");
        Matcher matcher2 = pattern2.matcher(str2);

        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + "    " + matcher2.group());
            //Position: 0    ABC
            //Position: 4    ABC
            //Position: 9    ABC
            //Position: 13    ABC
            //Position: 20    ABC
        }
        System.out.println();

        //Пример 3. Поиск любого символа из ABC
        System.out.println("Пример 3. Поиск любого символа из A-B-C");
        String str3 = "ADEFGCB";
        Pattern pattern3 = Pattern.compile("[ABC]");
        Matcher matcher3 = pattern3.matcher(str3);

        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + "    " + matcher3.group());
            //Position: 0    A
            //Position: 5    C
            //Position: 6    B
        }
        System.out.println();

        //Пример 4. Поиск подстроки AB[C-E]F
        System.out.println("Пример 4. Поиск подстроки AB[C-E]OF");
        String str4 = "ABDOF ABCEOF ABBOF ABFOF ABEOF7";
        Pattern pattern4 = Pattern.compile("AB[C-E]OF");
        Matcher matcher4 = pattern4.matcher(str4);

        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + "    " + matcher4.group());
            //Position: 0    ABDOF
            //Position: 25    ABEOF
        }
        System.out.println();

        //Пример 5. Поиск подстроки abc и одного из символов e-g и 4-7 [e-g4-7]
        System.out.println("Пример 5. Поиск подстроки abc и одного из символов e-g и 4-7 [e-g4-7]");
        String str5 = "abcd abcde abc5abce4abch";
        Pattern pattern5 = Pattern.compile("abc[e-g4-7]]");
        Matcher matcher5 = pattern5.matcher(str5);

        while (matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + "    " + matcher5.group());
        }
    }
}
