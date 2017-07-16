package company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class DeleteOneElementByIndex {
    static int[] a;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
    }

    static void getNewArray(int[] a, int[] newarray, int newsize, int index) {
        for (int i = 0; i < newsize; i++) {
            if (index > i) {
                newarray[i] = a[i];
            } else if (index == i) {
                newarray[i] = a[i + 1];
            } else if (index < i) {
                newarray[i] = a[i + 1];
            }
        }
    }


    public static void main(String[] args) {
        int size;
        int newsize;
        int index;

        System.out.print("Input the length of array: ");
        size = scanner.nextInt();
        newsize = size - 1;

        int array[] = new int[size];
        int arrayAfterDeleteOneElement[] = new int[newsize];
        fillArray(array);
        printArray(array);

        System.out.println();
        System.out.print("Input the index in array which should be deleted: ");
        index = scanner.nextInt();

        getNewArray(array, arrayAfterDeleteOneElement, newsize, index);
        printArray(arrayAfterDeleteOneElement);

    }
}

