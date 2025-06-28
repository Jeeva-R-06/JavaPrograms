//Total number of divisors of a given number

import java.util.Scanner;

public class TotalDivisors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                if(i == num/i){
                    count++;
                } else {
                    count+=2;
                }
            }
        }
       /* int i=1,count=1;
        while(i <= num/2){
            if(num%i == 0){
                count++;
            }
            i++;
        } */
        System.out.println("Total number of divisors: "+count);
    }
}
