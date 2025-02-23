//Write a Java program to find the factorial of a number.

import java.util.Scanner;

class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number to find its factorial: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("The factorial of a negative number is not defined");
        } else {

            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factroial of " + num + " is " + factorial);
        }
        sc.close();
    }
}