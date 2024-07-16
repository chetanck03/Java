import java.util.Scanner;

public class fact{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial => ");

        System.out.print("Enter the Number : ");
        int n = input.nextInt();

        long factorial = Fact(n);
        long fac = Fac(n);
        System.out.println("Factorial of "+n+ " is : " + factorial);
        System.out.println("Factorial of "+n+ " is : " + fac);
    }

    public static long Fact(int a){
        if(a<=1){
            return 1;
        }
        else{
            return a * Fact(a-1);
        }
    }

    public static long Fac(int a){
        if(a<=1)  return 1;
// second method
        int i=2;
        long fact =1;
        while(i<=a){
            fact*=i;
            i++;
        }
        return fact;
    }
}