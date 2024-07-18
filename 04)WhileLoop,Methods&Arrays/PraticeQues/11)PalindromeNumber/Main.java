import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome Number = >");

        System.out.print("Enter a number : ");
        int num = input.nextInt();

         Palindrome(num);
    }

    public static void Palindrome(int n){
        int number =n;
        int newNumber=0;

       // Reverse Number logic
        while(n>0){
            int digits = n%10; 
            newNumber = newNumber *10 + digits; 
            n/=10;  
        }

        if(newNumber==number){
            System.out.println(number + " is a Palindrome Number");
        }else{
            System.out.println(number + " is not a Palindrome Number");

        }

    }

}
