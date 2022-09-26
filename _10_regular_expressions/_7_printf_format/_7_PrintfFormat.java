package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._7_printf_format;

/**
 * = Папка 10. Регулярные выражения =
 * ---> Урок 7. Методы printf и format
 * @author Sergei Begletsov
 * @version 1
 * @since 22.10.2021
 */

//Методы printf и format
// %[flags][width][.precision] datatype_specifier, где:
// flags может быть:
//  «-» выравнивание по левому краю
//  «0» добавление нулей перед числом
//  «,» разделитель разрядов в числах
// DT specifiers м.б:
//  «b» boolean
//  «c» character
//  «d» целое число
//  «f» десятичное число
//  «s» String

public class _7_PrintfFormat {
    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                            emp.id, emp.name, emp.surname, emp.salary * ( 1 + emp.bonusPercent));
    }

    public static void main(String[] args) {
        Employee empl1 = new Employee(1, "Zaur", "Tregulov", 1234, 0.15);
        Employee empl2 = new Employee(2, "Ivan", "Petrov", 6542, 0.08);
        Employee empl3 = new Employee(3, "Marya", "Sidorova", 8542, 0.12);
        employeeInfo(empl1);
        employeeInfo(empl2);
        employeeInfo(empl3);
        //001 	 Zaur         	 Tregulov     	 1 419,1
        //002 	 Ivan         	 Petrov       	 7 065,4
        //003 	 Marya        	 Sidorova     	 9 567,0
    }
}
