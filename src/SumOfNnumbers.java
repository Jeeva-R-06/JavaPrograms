//Sum of First N natural Numbers using for loop

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the N value: ");
        n = scanner.nextInt();

        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+"natural numbers: "+sum);
    }
}
