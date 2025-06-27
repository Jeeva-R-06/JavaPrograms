//Sum of Even Numbers

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lower,upper,sum=0;
        System.out.println("Enter the lower limit: ");
        lower = scanner.nextInt();
        System.out.println("Enter the upper limit: ");
        upper = scanner.nextInt();

        if(lower%2!=0)
            lower = lower +1;

        for(;lower<=upper;lower+=2){
            sum+=lower;
        }
        System.out.println("Sum of Even Numbers: "+sum);
        }
}
