//Multiplication of a Number

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N,i;
        System.out.println("Enter the Table Number that you want: ");
        N = scanner.nextInt();

        System.out.println("Multiplication table of "+N+" is: ");
        for(i=1;i<=20;i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
}
