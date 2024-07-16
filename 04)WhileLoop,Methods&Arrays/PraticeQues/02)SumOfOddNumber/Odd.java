import java.util.Scanner;

public class Odd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of Odd Numbers => ");

        System.out.print("Enter the Number : ");
        int n = input.nextInt();

        int sum = Sum(n);
        System.out.println("Sum of Odd numbers till "+ n + " is : "+sum);
    }

    public static int Sum(int a){
        int sumOdd =0;
        int i =1;
        while(i<=a){
            sumOdd += i;
            i += 2;
        }
        return sumOdd ;
    }
}