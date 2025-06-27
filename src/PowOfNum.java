//Power of a Number

import java.util.Scanner;

public class PowOfNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num,pow,result=1;
        System.out.print("Enter the Number: ");
        Num = scanner.nextInt();
        System.out.print("Enter the Power: ");
        pow = scanner.nextInt();

        for(int i=1;i<=pow;i++){
            result=result*Num;
        }
        System.out.println(pow+" to the power of "+Num+" is "+result);
    }
}
