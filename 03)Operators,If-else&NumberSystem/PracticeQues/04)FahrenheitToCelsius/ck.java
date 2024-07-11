/*
  Create a program to convert Fahrenheit To Celsius : C=(F-32)*5/9
 */

import java.util.Scanner;

public class ck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fahrenheit To Celsius ");

        System.out.print("Enter the Fahrenheit: ");
        float F = input.nextFloat();

        float Cel = (F-32)* 5.0f/9.0f;
        System.out.println("Celsius is : "+ Cel +" C");
    }
}
