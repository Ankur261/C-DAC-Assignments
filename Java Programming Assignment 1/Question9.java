//Write a Java program that calculates the area of a circle.

import java.util.Scanner;

class Question9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input a number: ");
        int radius = sc.nextInt() ;

        double pi = 22f/7 ;
        double area = pi*radius*radius ;

        System.out.println("Area of Circle: " + area) ;

        sc.close();
    }
}
