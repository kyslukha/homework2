package com.alevel.homework2;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(number);
        String answer = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(answer);
    }
}
