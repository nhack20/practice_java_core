package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._8_monitor_synchronized_blocks;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 8. Понятие «монитор». Synchronized blocks
 * @author Sergei Begletsov
 * @version 1
 * @since 13.10.2021
 */

//1. Монитор - специальный механизм при котором достигается корректная работа при синхронизации.
//2. В Java у каждого объекта или класса есть привязанная сущность, которая называется мониторов.
//   Монитор имеет статус свободен/занят. Именно этот механизм исп. когда мы пишем слово synchronize.
//   Когда 1 поток заходит в область кода, помеченную как synchronize { код }, то монитор объекта или класса принимает статус "занято".
//   В одно и тоже время монитор может быть занят только 1 потоком, никакой другой поток не сможет работать с этим кодом, пока монитор не освободится.
//   Когда монитор занят каким-то потоком, то ставится замок "lock" для всех других потоков.
//   Первый поток, который зайдет в монитор, то и будет работать с синхронизированным кодом.
//3. Любая блокировка идет на объекте или классе, а не на каком либо коде.

public class _8_Monitor {
    public static void main(String[] args) throws InterruptedException {
        //1. Пример когда потоки не синхронизированы
        //3 1 2 5 4 7 6 8 9
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
