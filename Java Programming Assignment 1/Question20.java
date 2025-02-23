import java.util.Scanner ;


class Question20 {
   
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number") ;
    int num = sc.nextInt() ;

    int temp = num, count = 0 ;

    if(num>0) {
      while(temp>0) {
        temp = temp/10 ;
        count++ ;
      }
    }
    else if(num == 0) {
      count = 1;
    }

   

    System.out.println("The number " + num + " has " + count + " digits.");

    sc.close();
   
  }
}