//Check if a number is Palindrome or not

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,OriginalNum,reversedNumber=0,remainder;
        System.out.println("Enter the Number: ");
        Num = scanner.nextInt();
        OriginalNum = Num;

        for(;Num != 0; Num/=10){
            remainder = Num % 10;
            reversedNumber = reversedNumber*10 + remainder;
        }
        if(OriginalNum==reversedNumber){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Panlindrome Number");
        }
    }
}
