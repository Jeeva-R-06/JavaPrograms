//First n Fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int term1=0,term2=1,nextTerm=0;
        if(n<=0){
            System.out.println("Please enter positive number");
        } else if(n==1){
            System.out.println("The Fibonacci series is: "+term1);
            System.out.println("The "+n+"th Fibonacci Number is: "+nextTerm);
        } else {
            System.out.print("The Fibonacci series is: " + term1 + " " + term2);
            for (int i = 3; i <= n; i++) {
                nextTerm = term1 + term2;
                System.out.print(" " + nextTerm);
                term1 = term2;
                term2 = nextTerm;
            }
            System.out.println("\nThe "+n+"th Fibonacci Number is: "+nextTerm);
        }
    }
}
