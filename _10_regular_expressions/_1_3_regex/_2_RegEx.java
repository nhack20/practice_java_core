package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._1_3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 2. RegEx. Часть 2
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */


public class _2_RegEx {
    public static void main(String[] args) {
        //Пример 1. Поиск подстроки abc и любого символа
        System.out.println("Пример 1. Поиск подстроки abc и любого символа");
        String str1 = "abcd abcde abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("abc.");
        Matcher matcher1 = pattern1.matcher(str1);

        while (matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + "    " + matcher1.group());
            //Position: 0    abcd
            //Position: 5    abcd
            //Position: 11    abc5
            //Position: 15    abcg
            //Position: 20    abch
        }
        System.out.println();

        //Пример 2. Поиск подстроки abc в начале строки
        System.out.println("Пример 2. Поиск подстроки abc в начале строки");
        String str2 = "abcd abcde abc5abcg6abch";
        Pattern pattern2 = Pattern.compile("^abc");
        Matcher matcher2 = pattern2.matcher(str2);

        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + "    " + matcher2.group());
            //Position: 0    abc
        }
        System.out.println();

        //Пример 3. Поиск подстроки abc в конце строки
        System.out.println("Пример 3. Поиск подстроки abc в конце строки");
        String str3 = "abcd abcde abc5abcg6abch";
        Pattern pattern3 = Pattern.compile(".g6abch$"); //вариант 1 конец строки
        Matcher matcher3 = pattern3.matcher(str3);

        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + "    " + matcher3.group());
            //Position: 11    abc5abcg6abch
        }
        System.out.println();

        //Пример 4. Поиск любой цифры в строке
        System.out.println("Пример 4. Поиск любой цифры в строке");
        String str4 = "abcd abcde abc5abcg6abch";
        //Pattern pattern4 = Pattern.compile("[0-9]"); //вариант 1 поиска цифры
        Pattern pattern4 = Pattern.compile("\\d"); //вариант 2 поиска цифры
        Matcher matcher4 = pattern4.matcher(str4);

        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + "    " + matcher4.group());
            //Position: 14    5
            //Position: 19    6
        }
        System.out.println();

        //Пример 5. Поиск любой цифры или буквы в строке (но не пробел)
        System.out.println("Пример 5. Поиск любой цифры или буквы в строке (но не пробел)");
        String str5 = "abcd abcde abc5abcg6abch";
        Pattern pattern5 = Pattern.compile("\\w"); //[A-Za-z0-9]
        Matcher matcher5 = pattern5.matcher(str5);

        while (matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + "    " + matcher5.group());

        }
        System.out.println();

        //Пример 6. Поиск одного или более символов
        System.out.println("Пример 6. Поиск одного или более символов");
        String str6 = "abcd abcde abc5abcg6abch";
        Pattern pattern6 = Pattern.compile("\\w+");
        Matcher matcher6 = pattern6.matcher(str6);

        while (matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + "    " + matcher6.group());
            //Position: 0    abcd
            //Position: 5    abcde
            //Position: 11    abc5abcg6abch
        }
        System.out.println();

        //Пример 7. Поиск одного символа, который НЕ буква, НЕ цифра и НЕ «_»
        System.out.println("Пример 7. Поиск одного символа, который НЕ буква, НЕ цифра и НЕ «_»");
        String str7 = "abcd!&abcde?=abc5abcg+*6abch";
        Pattern pattern7 = Pattern.compile("\\W");
        Matcher matcher7 = pattern7.matcher(str7);

        while (matcher7.find()) {
            System.out.println("Position: " + matcher7.start() + "    " + matcher7.group());
            //Position: 4    !
            //Position: 5    &
            //Position: 11    ?
            //Position: 12    =
            //Position: 21    +
            //Position: 22    *
        }
        System.out.println();

        //Пример 8. Поиск небора символов, который НЕ буква, НЕ цифра и НЕ «_»
        System.out.println("Пример 8. Поиск небора символов, который НЕ буква, НЕ цифра и НЕ «_»");
        String str8 = "abcd!&abcde?===abc5abcg+*)6abch";
        Pattern pattern8 = Pattern.compile("\\W+");
        Matcher matcher8 = pattern8.matcher(str8);

        while (matcher8.find()) {
            System.out.println("Position: " + matcher8.start() + "    " + matcher8.group());
            //Position: 4    !&
            //Position: 11    ?===
            //Position: 23    +*)
        }
        System.out.println();

        //Пример 9. Поиск слов по 4 символа
        System.out.println("Пример 9. Поиск слов по 4 символа");
        String str9 = "poka abc Zaur dom kino abstractions";
        Pattern pattern9 = Pattern.compile("\\w{4}");
        Matcher matcher9 = pattern9.matcher(str9);

        while (matcher9.find()) {
            System.out.println("Position: " + matcher9.start() + "    " + matcher9.group());
            //Position: 0    poka
            //Position: 9    Zaur
            //Position: 18    kino
            //Position: 23    abst
            //Position: 27    ract
            //Position: 31    ions
        }
        System.out.println();
    }
}
