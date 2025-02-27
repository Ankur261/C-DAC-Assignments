import java.util.Scanner;

class Question18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input temperature in Celsius: ");
        int celsius = sc.nextInt();

        float fahrenheit = celsius*9f/5 + 32 ;

        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit");
        sc.close();
    }
}