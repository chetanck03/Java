import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the Digits of the Number = >");

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int result = Reverse(num);
        System.out.println("Reverse Number is : " + result);
    }

    public static int Reverse(int n){
        int newNumber=0;

        while(n>0){
            int digits = n%10; // Step 1
            newNumber = newNumber *10 + digits; // Step2
            n/=10;  //  Step 3
        }
        return newNumber; // Result

    }

}

/*
   Digit is :321
   
   Step 1 => Take the last digit [1] , [2] , [3]
   Step 2 => Add the last digit [0+1],[10+2],[120+3]
   Step 3 => Remove the last digit [32],[3],[0]
   
   Result : 123

*/