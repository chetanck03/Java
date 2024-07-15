import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication Table  => ");
        System.out.print("Enter the number : ");
        int a = input.nextInt();

        Table(a);
    }

    public static void Table(int b ){
        int i = 1;

        while (i<=10){
            System.out.println( b +" X "+ i +" = "+ b*i );
            i++;
        }
    }

}