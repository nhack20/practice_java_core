package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._11_other_important_themes._3_4_scanner;

import java.util.Scanner;

/**
 * = Папка 11. Другие важные темы =
 * ---> Урок 3. Класс Scanner. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 24.10.2021
 */

//1. Scanner sc = new Scanner(System.in); //работа с консолью
//2. Методы
// - nextByte(), nextInt(), nextShort(), nextLong(), nextFloat(), nextDouble(), nextBoolean()
// - hasNext(), hasNextLine(), hasNextInt()
// - next(), nextLine()
//3. Закрытие сканнера: scanner.close()

public class _3_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int num = scanner.nextInt();
//        System.out.println("Вы ввели - " + num);

//        System.out.println("Введите X:");
//        int x = scanner.nextInt();
//        System.out.println("Введите Y:");
//        int y = scanner.nextInt();
//        System.out.println("x = " + x + ", y = " + y);
//        System.out.println("Частное: " + x / y);
//        System.out.println("Остаток: " + x % y);

//        System.out.println("Напишите пару слов");
//        String str = scanner.nextLine();
//        System.out.println("Вы написали: " + str);

//        System.out.println("Напишите дробное");
//        double str = scanner.nextDouble();
//        System.out.println("Вы написали: " + str);
        scanner.close();

        Scanner scanner2 = new Scanner("Привет мой друг!\nКак твои дела?\nЧто хорошего?");
        //String s = scanner2.next(); //Привет
        //Вариант 1 обхода, может возникнуть исключение
//        String str = scanner2.nextLine();
//        System.out.println(str);
//        System.out.println(scanner2.nextLine());
//        System.out.println(scanner2.nextLine());

        //Вариант 2 обхода всех строк
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();
    }
}
