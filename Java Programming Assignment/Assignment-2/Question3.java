// Implement a program that calculates the sum of digits of an integer using modulus(%) and division (/) operators.
import java.util.Scanner;

class Question3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number");
		int num = sc.nextInt() ;
		int sum =0 ;
		while(num > 0) {
			int mod = num%10 ;
			sum = sum + mod ;
			num = num/10 ;
		}
		System.out.println("Sum of digits : " + sum);
		sc.close() ;
	}
}

