import java.util.* ;

    class Node {
        String name ;
        String number ;
        Node next ;

        Node(String name, String number) {
            this.name = name;
            this.number = number ;
            this.next = null ;
        }
    }

class CustomLinkList {
    Node head = null ;

  

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

    static void removeContact(Node head, String name) {
        Node prev = null ;
        if(head.name.equals(name)) {
            head = head.next ;
            System.out.println(head.name + "- contact deleted");
            return ;
        }
        while(head != null) {
            if(head.name == name) {
               head.next = head.next.next ;
            }
            prev = head ;
            head = head.next ;
            
        }
        System.out.println("Contact not found");
    }

    static void searchByName(Node head, String name) {
        while(head != null ) {
            if(head.name.equals(name)) {
                System.out.println(head.name+ ": " + head.number);
                return ;
            }
            head = head.next ;
        }
        System.out.println("Contact no found with name " + name);
    }

    static void displayAllContacts(Node head) {
        System.out.println("Contact List");
        while(head != null) {
            System.out.println(head.name + " , " + head.number);
            head = head.next ;
        }
    }

    static void choiceList(Scanner sc,  CustomLinkList llist) {

        System.out.println("Enter 1 to add a contact ");
        System.out.println("Enter 2 to display all contacts ");
        System.out.println("Enter 3 to search a contact ");
        System.out.println("Enter 4 to delete a contact ");
        System.out.println("Enter 5 to exit ");
        int choice = sc.nextInt() ;

        String name ;
        String number;
        
        switch(choice) {
            case 1 : 
            System.out.println("Enter number of the contact ");
            name = sc.next() ;
            System.out.println("Enter name of the contact ");
            number = sc.next() ;
            llist.head = CustomLinkList.createContact(llist.head, name, number) ;
            break ;
            case 2 : 
            CustomLinkList.displayAllContacts(llist.head) ;
            break ;
            case 3:
            System.out.println("Enter name of the contact you want to search");
            name = sc.next() ;
            CustomLinkList.searchByName(llist.head, name) ;    
            break ;
            case 4:
            System.out.println("Enter name of the contact you want to delete");
             name = sc.next() ;
            CustomLinkList.removeContact(llist.head, name) ;    
            break ;
            case 5:
            System.exit(0) ;  
            break ;
            default:
                System.out.println("Wrong Input") ;
        }

        choiceList(sc,llist);

    }
}

class LinkListContact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        CustomLinkList llist = new CustomLinkList() ;
        llist.head = CustomLinkList.createContact(llist.head, "Ankur", "9876543210") ;
        llist.head = CustomLinkList.createContact(llist.head, "Test", "4234234234") ;

        CustomLinkList.choiceList(sc, llist) ;
        
       
        // CustomLinkList.displayAllContacts(llist.head) ;
        CustomLinkList.searchByName(llist.head, "Test User") ;
        // CustomLinkList.removeContact(llist.head, "Ankur") ;


        sc.close() ;

    }
}