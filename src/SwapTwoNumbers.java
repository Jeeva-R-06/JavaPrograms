/*Program to Swap two numbers without using third variable and
without Arithmetic operator
 */

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first Number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the second Number: ");
        num2=scanner.nextInt();
        System.out.println("Numbers before swapping");
        System.out.println("Num1 = "+num1+" Num2 = "+num2);
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("Numbers After swapping");
        System.out.println("Num1 = "+num1+" Num2 = "+num2);

    }
}
