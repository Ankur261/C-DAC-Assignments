import java.util.* ;

class CustomLinkList {
    Node head = null ;
    Node tail = null ;

    public static class Node {
        String name ;
        String number ;
        Node next ;

        Node(String name, String number) {
            this.name = name;
            this.number = number ;
            this.next = null ;
        }
    }

    static Node createContact(Node head, String name, String number) {
        Node node = new Node(name, number);
        if(head == null) {
            head = node ;
            System.out.println("Contact Added: " +name + " " +  number);
            return head ;
            
        }
        else {
            node.next = head ;
            head = node ;
            System.out.println("Contact Added: " +name + " " +  number);
            return head ;
            
        }

    }

    // static Node removeContact(Node head, String Name) {

    // }

    static void searchByName(Node head, String name) {
        while(head != null ) {
            if(head.name == name) {
                System.out.println(head.name+ ": " + head.number);
            }
            head = head.next ;
        }
    }

    static void displayAllContacts(Node head) {
        System.out.println("Contact List");
        while(head != null) {
            System.out.println(head.name + " , " + head.number);
            head = head.next ;
        }
    }
}

class LinkListContact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        CustomLinkList llist = new CustomLinkList() ;
        llist.head = CustomLinkList.createContact(llist.head, "Ankur", "9876543210") ;

        CustomLinkList.displayAllContacts(llist.head) ;
        CustomLinkList.searchByName(llist.head, "Ankur") ;

    }
}