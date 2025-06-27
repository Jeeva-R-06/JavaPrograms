/* Program to check whether a given number is power of 2 in
Constant time( O(1) time complexity) imp. leetcode question
 */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the Number: ");
        num=scanner.nextInt();

        if((num & (num-1)) == 0){
            System.out.println("Given Number is Power of two");
        }
        else {
            System.out.println("Given Number is not Power of two");
        }
    }
}
