//Reverse a Number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,remainder=0,reverse=0;
        System.out.println("Enter the Number: ");
        Num = scanner.nextInt();

        for(;Num !=0;Num/=10){
            remainder = Num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reversed Number: "+reverse);
    }
}
