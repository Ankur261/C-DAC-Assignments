import java.util.*;

class GrandParent {

}

class Parent {
    int a  ;
    Parent(String name, int a) {
        System.out.println("Parent const " + name + a);
    }

    Parent() {
        System.out.println("Parent const " );
    }

}

class Child extends Parent {
    int b =10 ;
 Child() {

}
    Child(String name) {
        super("ANkur", 2);
        // super("AnkurA") ;
        System.out.println("Child class " + name);
    }
}

class Test {

    public static void main(String... args) {

        
      
      	// Map<Integer, String> m = new TreeMap<Integer, String>() ;
		// m.put(1, "Ankur") ;
		
		// m.put(3, "Ankur") ;
       
		// m.put(4, "Ankur") ;
		// m.put(22, null) ;
        // m.put(2, null) ;
        // m.put(115, "Ankur") ;
        // System.out.println(m) ;

        // System.out.println(null) ;
        
    }
}