package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._11_other_important_themes._1_2_enum;

import java.util.Arrays;

/**
 * = Папка 11. Другие важные темы =
 * ---> Урок 2. Enum. Часть 2
 * @author Sergei Begletsov
 * @version 1
 * @since 24.10.2021
 */

public class _2_Enum {
    public static void main(String[] args) {
        DayOfWeek2 day1 = DayOfWeek2.FRIDAY;
        System.out.println("настроение в этот день:" + day1.getMood());

        DayOfWeek2 day2 = DayOfWeek2.FRIDAY;
        DayOfWeek2 day3 = DayOfWeek2.MONDAY;
        System.out.print("day1==day2: ");
        System.out.println(day1 == day2);
        System.out.print("day1==day3: ");
        System.out.println(day1 == day3);

        DayOfWeek2 setMyDay = DayOfWeek2.valueOf("SUNDAY");
        System.out.println(setMyDay);
        System.out.println("all const enum: ");
        DayOfWeek2[] array = DayOfWeek2.values();
        System.out.println(array);
        System.out.println(Arrays.toString(array));
    }
}

enum DayOfWeek2 {
    MONDAY("bad"),     //понедельник
    TUESDAY("bad"),    //вторник
    WEDNESDAY("soso"),
    THURSDAY("soso"),
    FRIDAY("good"),
    SATURDAY("great"),   //суббота
    SUNDAY("great");      //воскресенье ;

    private String mood; //настроение

    private DayOfWeek2(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}