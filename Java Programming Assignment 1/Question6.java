//Write a Java program to print the sum, multiplication, subtraction, division, and remainder of two numbers.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt() ;
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt() ;

        System.out.println(firstNumber+" + "+secondNumber + " = " + (firstNumber+secondNumber)) ;
        System.out.println(firstNumber+" - "+secondNumber + " = " + (firstNumber-secondNumber)) ;
        System.out.println(firstNumber+"/"+secondNumber + " = " + firstNumber*secondNumber) ;
        System.out.println(firstNumber+" x "+secondNumber + " = " + firstNumber/secondNumber) ;
        System.out.println(firstNumber+" mod "+secondNumber + " = " + firstNumber%secondNumber) ;
        sc.close();
    }
}
