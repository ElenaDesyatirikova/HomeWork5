package company;

import java.util.Scanner;

public class DivisionAndRemainder {
    static int resultDivision = 0;
    static int resultRemainder = 0;
    static boolean error = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();

        if (number2 != 0) {
            System.out.println("Division is: " + getDivision(number1, number2));
            System.out.println("Remainder is: " + getRemainder(number1, number2));
        }
        else {
            System.out.println("You can't divide to 0!");
        }
    }

    static int getDivision (int number1, int number2) {
        if (number1 >= number2) {
            resultDivision ++;
            number1 = number1 - number2;
            return getDivision(number1, number2);
        }
        else if (number1 < number2) {
            return resultDivision;
        }
        else {
            return resultDivision;
        }
    }

    static int getRemainder (int number1, int number2) {
        if (number1 >= number2) {
            resultDivision ++;
            number1 = number1 - number2;
            return getRemainder(number1, number2);
        }
        else if (number1 < number2) {
            resultRemainder = number1;
            return resultRemainder;
        }
        else {
            return resultRemainder;
        }
    }

}
