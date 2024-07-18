import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Right Half Pyramid Pattern => ");
        RightHalfPyramid(num);

        System.out.println("Left Half Pyramid Pattern => ");
        LeftHalfPyramid(num);

        System.out.println("Reverse Right Half Pyramid Pattern => ");
        ReverseRightHalfPyramid(num);

    }

    public static void RightHalfPyramid(int num){
        int i=1;

        while(i<=num){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void LeftHalfPyramid(int num){
        int i =1;
        while(i<=num){
  //    For space
            int k=num;
            while(k>i){
                System.out.print("  ");
                k--;
            }
  //    For star
            int j=1;
            while(j<=i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;

        }
    }

    public static void ReverseRightHalfPyramid(int num) {

        while(num>0){
            int i =num;
            while(i>0){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            num--;
        }

    }
}

