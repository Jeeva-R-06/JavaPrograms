//Check if a Number is Prime or Not

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N,i,isPrime=0;
        System.out.println("Enter the Number: ");
        N = scanner.nextInt();

        for(i=2;i<Math.sqrt(N);i++){
            if(N%i==0)
                isPrime=1;

            if(isPrime==1)
                break;
        }

        if(N==1){
            System.out.println("1 is neither prime nor composite");
        }
        else if(isPrime==0){
            System.out.println(N+" is a Prime Numer");
        }
        else{
            System.out.println(N+" is not a Prime Number");
        }
    }
}
