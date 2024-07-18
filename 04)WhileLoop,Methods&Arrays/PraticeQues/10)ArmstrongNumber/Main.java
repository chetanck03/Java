import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking the Armstrong Number =>");

        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        Arm(num);

    }

    public static void Arm(int num) {
        int digits=0,result=0, newNum=num;

        // Checking the digits 
        while(newNum!=0){
            newNum/=10;
            digits++;
        }
        newNum=num;

        // Checking the Armstrong number
        while(newNum!=0){
            int lastDigit = newNum%10; //Take the last digit
            result += (int) Math.pow(lastDigit,digits);
            newNum/=10;//Remove the last digit

        }

        if(num==result) {
            System.out.println(num + " is an Armstrong number.");

        }else{
            System.out.println(num + " is not an Armstrong number.");
        }
        
    }
}