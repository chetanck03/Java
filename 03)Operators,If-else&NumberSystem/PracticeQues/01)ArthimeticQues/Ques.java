/*
 Create  a program to calculate the Operations of Arithmetic Operators
 */

import java.util.Scanner;

public class Ques{
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Operations of Arithmetic Operators ");
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();

//        Arithmetic Operators

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("Addition is : "+add);
        System.out.println("Subtraction is : "+ sub);
        System.out.println("Multiplication is : "+ mul);
        System.out.println("Divide is : "+ div);
        System.out.println("Modulus is : "+ mod);
    }
}