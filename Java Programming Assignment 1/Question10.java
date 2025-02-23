//Write a Java program that checks if a number is even or odd.

import java.util.Scanner;

class Question10 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input a number: ");
        int num = sc.nextInt() ;


        System.out.println("The number " + num + " is " + (num%2 == 0 ? "even" : "odd")) ;

        sc.close();
    }
}
