//Print Numbers in Reverse

import java.util.Scanner;

public class PrintNumberReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,i;
        System.out.println("Enter the Number: ");
        Num = scanner.nextInt();

        for(i=Num;i>=1;i--){
            System.out.println(i);
        }
    }
}
