//Write a Java program to swap the values of two variables without using a third variable.

import java.util.Scanner;

public class Question8 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input a number: ");
        int num1 = sc.nextInt() ;

        System.out.print("Input a number: ");
        int num2 = sc.nextInt() ;

        System.out.println("Befor swapping:") ;
        System.out.println("First number: " + num1) ;
        System.out.println("Second number: " + num2) ;

        num1 = num1 + num2 ;
        num2 = num1 - num2 ;
        num1 = num1 - num2 ;

        System.out.println("After swapping:") ;
        System.out.println("First number: " + num1) ;
        System.out.println("Second number: " + num2) ;

        sc.close();
    }
}
