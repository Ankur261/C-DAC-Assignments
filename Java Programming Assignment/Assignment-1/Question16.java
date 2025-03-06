//Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

class Question16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = sc.nextInt();

        boolean isPrime = true ;
        if (num > 1) {
            for (int i = 2; i <= num/2; i++) {
                if(num%i == 0) {
                    isPrime = false ;
                    break ;
                }
            }
            System.out.println("The number " + num + " is " + (isPrime ? "Prime" : "not Prime"));
        } else {
            System.out.println(" prime numbers are defined as positive integers greater than 1.");
           
        }
        sc.close();
    }
}