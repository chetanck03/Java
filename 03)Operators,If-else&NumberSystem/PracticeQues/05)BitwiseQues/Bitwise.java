import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

/*   (8421) Method

 1) Bitwise AND (&) : Multiply of two numbers like
        4 => 0100
        5 => 0101
        ------------
        4 => 0100

 2) Bitwise OR (|) : Add of two numbers like
        4 => 0100
        5 => 0101
        ------------
        5 => 0101

 3) Bitwise XOR (^) :
    Same Numbers turns => 0
    Different Numbers turns =>1

        4 => 0100
        5 => 0101
        ------------
        1 => 0001

 4) Bitwise Compliment (~) : Change the value from 0to1 & vice-versa
         4 => 0100
        ------------
        11 => 1011

    -> Note : Compiler will give 2's compliment of 11 = -5

 5) Left Shift Operator (<<) : Shift the left operands bits to the right ; like its Shift by 1 digit
              |
         4 => 0100
        ------------
         8 => 1000
                 |
 6) Right Shift Operator (>>) : Shift the right operands bits to the left ; like its Shift by 1 digit
                 |
         4 => 0100
        ------------
         2 => 0010
              |
 7) Check Even or Odd using Bitwise AND :

    -> If last digit of value is 0 = Even
    -> If last digit of value is 1 = Odd

                 |
         4 => 0100 => Even
        ------------
         5 => 0101 => Odd
                 |

    -> Like :  Bitwise AND
                |                           |
        4 => 0100                   5 => 0101
        1 => 0001                   1 => 0001
        ------------               ------------
      Even=> 0000                 Odd => 0001
                |                           |
*/
        System.out.print("Enter the First Number : ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = input.nextInt();

        System.out.println("Result of Bitwise AND of Two numbers : " + (a&b));
        System.out.println("Result of Bitwise OR of Two numbers : " + (a|b));
        System.out.println("Result of Bitwise XOR of Two numbers : " + (a^b));
        System.out.println("Result of Bitwise Compliment of First Number : " + ~a);
        System.out.println("Result of Bitwise Left Shift of First Number : " + (a<<1));
        System.out.println("Result of Bitwise Right Shift of First Number : " + (a>>1));
        
//        Even or Odd
        if((a & 1)== 1) {
            System.out.println("First number is Odd Number : " + a);
        }else {
            System.out.println("First number is Even Number : " + a);
        }

        if((b & 1)== 1) {
            System.out.println("Second number is Odd Number : " +b);
        }else {
            System.out.println("Second number is Even Number : "+b);
        }
    }
}