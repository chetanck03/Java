/*
  Practice Questions:
  1) Create a program to input name of the person & respond with "Good Morning NAME" ?
  2) Create a program to add two numbers ?
 */

 import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Question 1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.println("Good Morning "+name);

        // Question 2
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        int sum = a+b;

        System.out.println("Sum is : "+sum);
    }
}
