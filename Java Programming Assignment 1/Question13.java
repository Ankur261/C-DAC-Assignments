//Write a Java program to calculate the average of three numbers.

import java.util.Scanner;


class Question13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();

        System.out.println("Input second number: ");
        int num2 = sc.nextInt() ;

        System.out.println("Input second number") ;
        int num3 = sc.nextInt() ;

        System.out.println("The average is: " + (double)(num1 + num2 + num3)/3 ) ;

        sc.close();
    }
}