//Sum of Digits of a Number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,sum=0,remainder;
        System.out.println("Enter the Number: ");
        Num = scanner.nextInt();

        for(;Num !=0;Num/=10){
            remainder = Num % 10;
            sum = sum + remainder;
        }
        System.out.println("Sum of digits of this Number: "+sum);
    }
}
