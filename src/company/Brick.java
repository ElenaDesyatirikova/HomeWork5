package company;

import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Brick {
    static double getDiametrOfCircleNearRectangle (double x, double y) {
        double d = (double)Math.sqrt ((double)Math.pow(x, 2) + (double)Math.pow(y, 2));
        return d;
    }

    public static void main(String[] args) {

        System.out.println("Input 4 numbers - x, y, z and d: ");
        Scanner sc = new Scanner(System.in);
        double [] numbers = new double[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        double x = numbers[0];
        double y = numbers[1];
        double z = numbers[2];
        double diametr = numbers[3];

        double first, second, third;
        first = getDiametrOfCircleNearRectangle(x, y);
        second = getDiametrOfCircleNearRectangle(y, z);
        third = getDiametrOfCircleNearRectangle(x, z);

        if (first <= diametr) {
            System.out.println("The brick can pass in the circle with sides: " + "x = " + x + " and y = " + y);
        }
        if (second <= diametr) {
            System.out.println("The brick can pass in the circle with sides: " + "y = " + y + " and z = " + z);
        }
        if (third  <= diametr) {
            System.out.println("The brick can pass in the circle with sides: " + "x = " + x + " and z = " + z);
        }
        else {
            if (first >= diametr & second >= diametr & third >= diametr) {
                System.out.println("The brick can't pass in the circle!");
            }
        }

    }
}

