//Write a Java program that takes three numbers as input and finds the largest of the three.

import java.util.Scanner;

class Question11 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input first number: ");
        int num1 = sc.nextInt() ;

        System.out.print("Input second number: ");
        int num2 = sc.nextInt() ;

        System.out.print("Input third number: ");
        int num3 = sc.nextInt() ;

        int largestNum = num1  ;

        if(num1 > num2 && num1 > num3) {
            largestNum = num1 ;
        }
        else if(num2 > num1 && num2 > num3) {
            largestNum = num1 ;
        }
        else {
            largestNum = num3 ;
        }

        System.out.println("The largest number is " +largestNum) ;

        sc.close();
    }
}
