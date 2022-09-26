package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._11_other_important_themes._1_2_enum;

/**
 * = Папка 11. Другие важные темы =
 * ---> Урок 1. Enum. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 23.10.2021
 */

//1. enum – это способ ограничить какую-либо информацию конкретным списком возможных вариантов
//2. Конструктор в enum имеет access modifier private и не нуждается во внешнем вызове
//3. enum является дочерним классом для java.lang.Enum часто используемые методы: valueOf, values

public class _1_Enum {
    public static void main(String[] args) {
        Today today = new Today(DayOfWeek.MONDAY);
        today.daysInfo();
    }
}

class Today {
    private DayOfWeek dayOfWeek;

    public Today(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void daysInfo() {
        switch (dayOfWeek) {
            case     MONDAY:     //понедельник
            case     TUESDAY:    //вторник
            case     WEDNESDAY:
            case     THURSDAY:
            case     FRIDAY:
                System.out.println(dayOfWeek);
                System.out.println("Выходи на работу");
                break;
            case     SATURDAY:   //суббота
            case     SUNDAY:      //воскресенье
                System.out.println(dayOfWeek);
                System.out.println("Можно отдохнуть");
                break;
        }
    }
}

enum DayOfWeek {
    MONDAY,     //понедельник
    TUESDAY,    //вторник
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,   //суббота
    SUNDAY      //воскресенье
}