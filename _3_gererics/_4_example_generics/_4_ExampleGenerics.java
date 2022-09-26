package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._3_gererics._4_example_generics;

/**
 * = Папка 3. Generics =
 * ---> Урок 4. Пример на generics
 * @author Sergei Begletsov
 * @since 02.10.2021
 * @version 1
 */

public class _4_ExampleGenerics {
    public static void main(String[] args) {
        //<?> - любой класс
        //<? extends X> - класс X или любой его подкласс (сабкласс)
        //<? super Y> - класс Y или любой его суперкласс

        Schoolar schIvan = new Schoolar("Ivan", 13);
        Schoolar schMary = new Schoolar("Mary", 15);

        Student studNikolay = new Student("Nikolay", 20);
        Student studKsenya = new Student("Ksenya", 18);

        Worker workZaur = new Worker("Zaur", 32);
        Worker workMihail = new Worker("Mihail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Школа №68. Драконы");
        schoolarTeam.addNewParticipant(schIvan);
        schoolarTeam.addNewParticipant(schMary);

        Team<Student> studentTeam = new Team<>("Студенты УГТУ-УПИ им. Ельцина. 2005г");
        studentTeam.addNewParticipant(studNikolay);
        studentTeam.addNewParticipant(studKsenya);

        Team<Worker> workerTeam = new Team<>("Работники ООО НПО Горизонт");
        workerTeam.addNewParticipant(workZaur);
        workerTeam.addNewParticipant(workMihail);

        //Team<String> stringTeam = new Team<String>("StringTeam");
        Team<Schoolar> schoolarTeam2 = new Team<>("Школа №98. Троечники");
        Schoolar schSergey = new Schoolar("Sergei", 14);
        Schoolar schNina = new Schoolar("Nina", 16);
        schoolarTeam2.addNewParticipant(schSergey);
        schoolarTeam2.addNewParticipant(schNina);
        //schoolarTeam2.playWith(studentTeam);
        //schoolarTeam.playWith(workerTeam);
        schoolarTeam2.playWith(schoolarTeam);
    }
}
