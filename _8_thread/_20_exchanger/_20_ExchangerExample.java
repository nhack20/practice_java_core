package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._20_exchanger;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 20. Синхронизатор Exchanger
 * @author Sergei Begletsov
 * @version 1
 * @since 18.10.2021
 */

//1. Exchanger - синхронизатор, позволяющий обмениваться данными между двумя потоками, обеспечивает то,
//   что оба потока получат информацию друг от друга одновременно.
//2. Только когда оба поток вызывает exchange происходит одновременный обмен информацией.
//3. Методы:
// - exchange

public class _20_ExchangerExample {

}

enum Action {
    ROCK, SCISSORS, PAPER
}