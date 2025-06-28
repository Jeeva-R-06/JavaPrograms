//LCM of two integers
//Asked in Amazon, FB, Adobe

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        int a = num1;
        int b = num2;

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("LCM of "+a+" and "+b+" is: "+((a*b)/num1));

        /*int max = num1 > num2 ? num1 : num2;
        int lcm = max;
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                break;
            }
            lcm+=max;
        }
        System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);*/
    }
}
