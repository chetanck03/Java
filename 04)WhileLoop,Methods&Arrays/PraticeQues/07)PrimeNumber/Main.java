import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Checking the Number is prime or not = >");

        System.out.print("Enter a number : ");
        int num = input.nextInt();
        boolean check =Prime(num);

        String result = (check)?("Its a Prime Number"):("Its not a Prime Number");
        System.out.println(result);
    }

    public static boolean Prime(int n){
        int i=2;
        while(i<n){
            if(n%i==0) return false;
            i++;
        }
        return true;
    }

}