//Write a Java program to print the Fibonacci series up to the 10th number.

class Question14 {
    public static void main(String[] args) {

        int num = 0, firstNum=0, secondNum=1 ;
        System.out.print(firstNum+" "+secondNum+" ") ;
        for(int i = 0 ; i<8 ; i++) {
            num = secondNum + firstNum ;
            System.out.print(num+" ") ;
            firstNum = secondNum ;
            secondNum = num ;
        }
    }
}