/*Program to find out whether given number is Even or Odd
using Bitwise Operator
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scanner.nextInt();
        if((num & 1) == 0) {
            System.out.println("Even Number!");
        }
        else {
            System.out.println("Odd Number!");
        }
    }
}
