package com.alevel.homework2;

public class Least {
    public static void main(String[] args) {
        int number1 = -7;
        int number2 = 1;
        int number3 = 3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        if (number1 < 0) number1 = -1 * number1;
        if (number2 < 0) number2 = -1 * number2;
        if (number3 < 0) number3 = -1 * number3;
        if ((number1 < number2) && (number1 < number3)) {

            System.out.println("least number is" + number1);

        } else {
            if (number2 < number3) {
                System.out.println("least number is" + number2);
            } else {
                System.out.println("least number is" + number3);
            }
        }
    }
}
