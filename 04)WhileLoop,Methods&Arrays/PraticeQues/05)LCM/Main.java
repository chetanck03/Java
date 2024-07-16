import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("LCM of the Two Numbers => ");

        System.out.print("Enter the First Number : ");
        int a = input.nextInt();
        System.out.print("Enter the First Number : ");
        int b = input.nextInt();

        int lcm = LCM(a,b);
        System.out.println("LCM of "+a+ " & "+ b + " is : " + lcm);
    }
//lcm : least common multiple (larger numbers divide the both numbers)
    public static int LCM(int n1,int n2){

        int max = (n1>n2) ? n1 : n2;

        while(true){
            if(max%n1==0 && max%n2==0){
                return max;
            }
            ++max;
        }

    }
}