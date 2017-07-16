package company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class ThreeMinNumbersFromArray {
    static int[] a;
    static int min1 = 0;
    static int min2 = 0;
    static int min3 = 0;

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void fillArrayRandomNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
    }

    static void sortFirstThreeElements (int [] a){
        int temp = 0;
        if (a [1] > a [2]){
            temp = a[1];
            a[1] = a [2];
            a[2] = temp;
        }
        if (a[0] > a[1] & a [0] < a [2]) {
            temp = a [0];
            a[0] = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        if (a[0] > a[1]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        min1 = a[0];
        min2 = a[1];
        min3 = a[2];
    }

    static void findThreeMinNumbers (int [] a) {
        for (int i = 3; i < a.length; i++) {
            if (a[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = a[i];
            } else {
                if (a[i] < min2) {
                    min3 = min2;
                    min2 = a[i];
                }
                else {
                    if (a[i] < min3){
                        min3 = a[i];
                    }
                }
            }
        }
    }

    static void fillArrayOfMinNumbers (int [] a, int min1, int min2, int min3) {
        a[0] = min1;
        a[1] = min2;
        a[2] = min3;
    }

    public static void main(String[] args) {
        int size;

        System.out.print("Input the length of array: ");
        size = scanner.nextInt();

        int array[] = new int[size];
        int arrayOfMin [] = new int [3];

        fillArrayRandomNumbers(array);
        printArray(array);

        System.out.println();

        sortFirstThreeElements(array);

        findThreeMinNumbers(array);

        fillArrayOfMinNumbers(arrayOfMin, min1, min2, min3);

        System.out.println("Three min elements in array are: ");
        printArray(arrayOfMin);
    }
}


