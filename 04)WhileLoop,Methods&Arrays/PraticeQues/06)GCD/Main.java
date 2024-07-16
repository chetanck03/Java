import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("GCD of the Two Numbers => ");

        System.out.print("Enter the First Number : ");
        int a = input.nextInt();
        System.out.print("Enter the First Number : ");
        int b = input.nextInt();

        int gcd = GCD(a,b);
    
        System.out.println("GCD of "+a+ " & "+ b + " is : " + gcd);
    }
//GCD : Greatest Common Divisor (smallest number which is divide both numbers)
    public static int GCD(int n1,int n2){
        if(n2==0) {
            return n1;
        }else{
            return GCD(n2,n1%n2);
        }
    }

}
