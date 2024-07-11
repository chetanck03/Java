/*
   Create  a program to calculate product of two floating points numbers
 */

import java.util.Scanner;

class Ques{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Product of Floating Numbers => ");

        System.out.print("Enter First Number : ");
        double a = input.nextDouble();
        System.out.print("Enter Second Number : ");
        double b = input.nextDouble();

        double pro = a*b;
        System.out.println("Product is : " + pro);
        System.out.println("Product is : " + (a*b));


    }
}