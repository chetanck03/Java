/*
  1) Create a program to swap two Numbers.
 
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Before Swap the Two Numbers");
        System.out.print("Enter the First Number : ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = input.nextInt();

        int c;

// Swapping Logic
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap the Two Numbers");
        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);

    }
}