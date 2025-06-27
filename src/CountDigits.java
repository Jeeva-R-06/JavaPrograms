//Reverse a given Number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,count=0;
        System.out.println("Enter the Number to reverse: ");
        Num = scanner.nextInt();

        for(;Num != 0; Num/=10){
            count++;
        }
        System.out.println("Number of Digits in this number: "+count);
    }
}
