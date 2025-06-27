// Check if a Number is Prime or Not
import java.util.Scanner;
import java.lang.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, i;
        boolean isPrime = true;

        System.out.print("Enter the Number: ");
        N = scanner.nextInt();

        if (N <= 1) {
            System.out.println(N+" is not a Prime");
        } else {
            for (i = 2; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N+" is a Prime Number");
            } else {
                System.out.println(N+" is not a Prime");
            }
        }
        scanner.close();
    }
}
