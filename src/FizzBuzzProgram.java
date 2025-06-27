/*FizzBuzzProgram
Print numbers from 1 to n.
For multiples of 3, print “Fizz”, for multiples of 5, print “Buzz” and
for multiples of both print “FizzBuzz”.
*/

import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = scanner.nextInt();

        for(int i=1;i<=Num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
