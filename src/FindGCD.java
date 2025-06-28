//Find the GCD of two positive integer
//Asked in FB, Microsoft, Tcs

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        int a = num1;
        int b = num2;

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD of "+a+" and "+b+" is: "+num1);

       /* int gcd = 1;
        int min = num1 < num2 ? num1 : num2;
        for( int i=min;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);*/
    }
}
