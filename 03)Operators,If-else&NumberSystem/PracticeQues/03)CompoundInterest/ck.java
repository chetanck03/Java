/*
  Create  a program to calculate a compound interest = P(1+R/100)t
*/

import java.util.Scanner;

public class ck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Compound Interest ");

        System.out.print("Enter the Principle amount Rs: ");
        int P = input.nextInt();
        System.out.print("Enter the Time in years : ");
        float T = input.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float R = input.nextFloat();

        double comp = P * Math.pow((1+R/100),T);
        System.out.println("Compound Interest is : "+ comp);
    }
}
