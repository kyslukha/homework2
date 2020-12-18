package com.alevel.homework2;

public class Least {
    public static void main(String[] args) {
        int number1 = -7;
        int number2 = - 100;
        int number3 = 3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3); // I just want to add more iteration
        if ((Math.abs(number1) < Math.abs(number2)) && (Math.abs(number1) < Math.abs(number3))) {
            System.out.println("least number is " + number1);
        } else {
            if (number2 < number3) {
                System.out.println("least number is " + number2);
            } else {
                System.out.println("least number is " + number3);
            }
        }
    }
}
