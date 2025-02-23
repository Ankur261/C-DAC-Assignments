import java.util.Scanner;

class Question17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i+" ");
            }
            
        } else {
            System.out.println("Input a natural number");
           
        }
        sc.close();
    }
}