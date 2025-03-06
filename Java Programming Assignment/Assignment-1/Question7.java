//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Question7 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input a number: ");
        int num = sc.nextInt() ;

        for(int i=1 ; i<=10 ; i++) {
            System.out.println(num+" x "+ i + " = " + num*i) ;
        }
       
       
        sc.close();
    }
}
