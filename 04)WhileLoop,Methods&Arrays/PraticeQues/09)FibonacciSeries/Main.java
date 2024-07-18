import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci Series = >");

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.print("Fibonacci Series up to certain number is  : " );
        Fib(num);

    }

    public static void Fib(int n){
        if(n<0 || n==0) {
            System.out.println("0");
            return ;
        }

       // Logic of Fibonacci Series
        int first =0,second =1;
        System.out.print(first+" "+second+" ");

        while(first+second<n){
            int third = first+second;
            System.out.print(third+" ");

            first = second;
            second = third;
        }

    }


}
