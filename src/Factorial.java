//Factorial of a Number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N,i,fact=1;
        System.out.println("Enter the number factorial which number you want: ");
        N = scanner.nextInt();

        for(i=N;i>1;i--){
            fact*=i;
        }
        System.out.println("Factorial of "+N+" is: "+fact);
    }
}
