//Count Digits in a given Number

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,count=0;
        System.out.print("Enter the Number: ");
        Num = scanner.nextInt();

        if(Num==0){
            System.out.println("Number of Digits in this number: 1");
        } else {
            for (; Num != 0; Num /= 10) {
                count++;
            }
            System.out.println("Number of Digits in this number: " + count);
        }
    }
}
