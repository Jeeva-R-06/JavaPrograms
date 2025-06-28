//Check the given number is perfect number or not

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        int i=1,sum=0;
        if(num < 1){
            System.out.println("Invalid Number");
        } else {
            System.out.print("The proper divisors of "+num+" are: ");
            while (i <= num / 2) {
                if (num % i == 0) {
                    System.out.print(i+" ");
                    sum += i;
                }
                i++;
            }
            if (num == sum) {
                System.out.println("\n"+num + " is a Perfect Number");
            } else {
                System.out.println("\n"+num + " is not a Perfect Number");
            }
        }
    }
}
