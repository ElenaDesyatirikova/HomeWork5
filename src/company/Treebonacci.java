package company;

import java.util.Scanner;

public class Treebonacci {

    static int[] arrayTreebonacci;
    static int treebonacciLength = 30;

    static int getTreebonacciNumber(int number) {
        if (number <= 2) {
            return 1;
        }
        if (number ==3) {
            return 2;
        }
        else {
            return getTreebonacciNumber(number - 1) + getTreebonacciNumber(number - 2) + getTreebonacciNumber(number - 3);
        }
    }

    static void getTreebonacciSequence(int a[], int length) {
        int treebonacciNumbers = 0;
        int treebonacciNumberN1 = 1;
        int treebonacciNumberN2 = 1;
        int treebonacciNumberN3 = 2;

        for (int i = 1; i <= length; i++) {
            if (i == 1) {
                treebonacciNumbers = 1;
            }
            if (i == 2) {
                treebonacciNumbers = 1;
            }
            if (i == 3) {
                treebonacciNumbers = 2;
            }
            if (i >= 4) {
                treebonacciNumbers = treebonacciNumberN1 + treebonacciNumberN2 + treebonacciNumberN3;
                treebonacciNumberN1 = treebonacciNumberN2;
                treebonacciNumberN2 = treebonacciNumberN3;
                treebonacciNumberN3 = treebonacciNumbers;
            }
            a[i-1] = treebonacciNumbers;
        }
    }
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arrayFibonacci = new int[treebonacciLength];
        getTreebonacciSequence(arrayFibonacci, treebonacciLength);
        printArray(arrayFibonacci);
        System.out.println();

        System.out.println("Input the index of Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int fibonacciIndex = scanner.nextInt();
        int fibonacciNumbers;

        fibonacciNumbers = getTreebonacciNumber(fibonacciIndex);
        System.out.println("The number in Fibonacci sequence with index " + fibonacciIndex + " is " + fibonacciNumbers);

        //Check the correct number in Fibonacci sequence
        if (fibonacciNumbers == arrayFibonacci[fibonacciIndex-1]) {
            System.out.println("It's correct!");
        } else {
            System.out.println("It's incorrect!");
        }
    }
}
