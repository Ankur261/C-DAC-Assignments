class GrandParent {

}

class Parent {
    Parent(String name, int a) {
        System.out.println("Parent const " + name + a);
    }

    Parent() {
        System.out.println("Parent const " );
    }

}

class Child extends Parent {
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
        Child c = new Child("Ankur");
        Parent p1 = new Child() ;
    }
}