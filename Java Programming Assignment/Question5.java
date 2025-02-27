//Write a Java program that takes two numbers as input and displays the product of the two numbers.


import java.util.Scanner;

public class Question5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt() ;
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt() ;

        System.out.println(firstNumber+" x "+ secondNumber + " = " + firstNumber*secondNumber) ;
        sc.close();
    }
}
