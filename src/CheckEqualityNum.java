/* Program to determine if two numbers are equal using only
Bitwise or Arithmetic Operators
 */

import java.util.Scanner;

public class CheckEqualityNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first Number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the second Number: ");
        num2=scanner.nextInt();

        if((num1^num2) == 0){
            System.out.println("Same Numbers");
        }
        else{
            System.out.println("Different Numbers");
        }
    }
}
