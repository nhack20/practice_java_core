package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._6_replaceall_group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 6. Методы replaceAll и group
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */

public class _6_ReplaceAll_and_Group {
    public static void main(String[] args) {
        //Пример 1 - замена "java" -> "python"
        String s1 = "Привет,       мой      друг!          Как    у тебя   успехи  в  java? может надо быстрее?)";
        System.out.println("Пример 1: замена \"java\" -> \"python\"");
        System.out.println(s1);
        s1 = s1.replace("java", "python");
        System.out.println(s1);
        System.out.println();

        //Пример 2 - убираем 2+ (2 или более) пробелов
        System.out.println("Пример 2: убираем 2+ (2 или более) пробелов");
        String s2 = s1.replaceAll(" {2,}", " ");
        System.out.println(s2);
        System.out.println();

        //Пример 3 - замена подстроки по шаблону
        String s3 = "Privet, moi drug! Kak y tebia uspehi v java? mozhet nado bistree?";
        System.out.println("Пример 3: замена подстроки по шаблону");
        System.out.println(s3);
        s3 = s3.replaceAll("\\bmoz\\w+", "davai");
        System.out.println(s3);
        System.out.println();

        //Пример 4 - замена формата для строки с номерами карт
        System.out.println("Пример 4: замена формата для строки с номерами карт");
        String cardNumber = "12345555111122220325654; " +
                "87193334198733351222553; " +
                "64931234567889000724666;";
        // 03/25 1234-5555-1111-2222 {654}
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(cardNumber);

//        String newStringCardNumber = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println("MM/YY   NUMBER-CARD   (CVS-CODE):");
//        System.out.println(newStringCardNumber);
        //03/25 1234 5555 1111 2222 (654); 12/22 8719 3334 1987 3335 (553); 07/24 6493 1234 5678 8900 (666);

        while (matcher.find()) {
            System.out.println(matcher.group(7));
            //654
            //553
            //666
        }
    }
}
