import java.util.Scanner ;


class Question19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Input base number: ");
        int baseNum = sc.nextInt() ;

        System.out.println("Input exponent number: ");
        int exponent = sc.nextInt() ;

        int result=1 ;

        for(int i=0 ; i<exponent ; i++) {
            result = result*baseNum ;
        }

        System.out.println(baseNum + " raised to the power "+ exponent + " is " + result);

        sc.close();
    }
}