package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._4_collections._12_stack;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println("stack: " + stack);
//        System.out.println(stack.pop());
//        System.out.println("stack: " + stack);
//        System.out.println(stack.pop());
//        System.out.println("stack: " + stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println("stack: " + stack);
        }
    }
}
