//Write a Java program that takes a number as input and prints the reverse of that number.

import java.util.Scanner;


class Question12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Input number: ");
        int num = sc.nextInt() ;
        int reverseNum = 0, temp, tempNum = num ;

        while(num > 0) {
            temp = num%10 ;
            reverseNum = reverseNum*10  + temp;
            num = num/10 ;
        }

        System.out.println("The reverse of "+ tempNum + " is " + reverseNum);

        sc.close() ;
    }
}