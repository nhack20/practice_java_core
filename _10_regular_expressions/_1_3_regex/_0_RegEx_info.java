package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._10_regular_expressions._1_3_regex;

//Часто используемые символы в REGEX
// abc – Соответствует последовательно идущим abc
// [abc] – Соответствует или a, или b, или c
// [d-j] – Соответствует одной из букв из диапазона d - j
// [3-8] – Соответствует одной из цифр из диапазона 3-8
// [B-Fd-j3-8] – Соответствует одной из букв из обоих диапазонов или одной из цифр из диапазона 3 - 8
// a|b – Соответствует либо букве a, либо букве b

// [^d-j] – Данный символ, стоящий в начале этих скобок, означает отрицание. Соответствует одной из
// букв НЕ из диапазона d - j . – Соответствует одному любому символу.
// Исключение: символ новой строки
// ^выражение – Соответствует выражению в начале строки
// выражение$ – Соответствует выражению в конце строки

// \d – Соответствует одной цифре
// \D – Соответствует одной НЕ цифре
// \w – Соответствует одной букве, цифре или «_»
// \W – Соответствует одному символу, который НЕ буква, НЕ цифра и НЕ «_»
// \s – Соответствует пробельному символу
// \S – Соответствует НЕ пробельному символу

// \A – Соответствует выражению в начале String-а \Z – Соответствует выражению в конце String-а \b – Соответствует границе слова или числа
// \B – Соответствует границе НЕ слова и НЕ числа

// выражение? – Соответствует 0 или 1 повторению
// выражение* – Соответствует 0 или большему количеству повторений
// выражение+ – Соответствует 1 или большему количеству повторений
// выражение{n} – Соответствует количеству повторений «n»
// выражение{m, n} – Соответствует количеству повторений от «m» до «n»
// выражение{n,} – Соответствует n или большему количеству повторений

public class _0_RegEx_info {
}
