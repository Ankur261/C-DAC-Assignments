

public class Generics {
    int a = 10;
    String as = "dsada" ;
    public static void main(String[] args) {
        // Box intBox = new Box(); 
        // intBox.setValue(10);
        // // System.out.println(intBox.getValue()); // Output: 10

        // Box strBox = new Box();
        // strBox.setValue("Hello");
        // System.out.println(strBox.getValue()); // Output: Hello
        Generics ref = new Generics() ;
        String str1 = "ankur" ;
        String str2 = "Hello" ;
        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;
        System.out.println(str1.compareTo(str2)) ;
        String str = ref.toString() ;
        System.out.println(str) ;
    }
}