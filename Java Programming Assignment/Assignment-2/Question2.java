// Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -.
import java.util.Scanner;

class Question2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number");
		int num = sc.nextInt() ;
		System.out.println("Entered number is : " + ((num&1) == 1 ? "Odd" : "Even" ));
		sc.close() ;
	}
}

