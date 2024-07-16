import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of the digits => ");

        System.out.print("Enter the Number : ");
        int n = input.nextInt();

        int sumOfDigits = Sum(n);
        System.out.println("Sum of the digits till  "+n+ " is : " + sumOfDigits);
    }

    public static int Sum(int a){
        int sum =0;

        while(a>0){
            sum+=a%10; // add the last digit to the sum => Take the remainder
            a/=10; // remove the last digit => Take the Quotient
        }
        return sum;

    }
}