
// import java.util.ArrayList;
// import java.util.HashSet;

// class Employee{
// 	private int empId;
// 	private String empName;
	
// 	public Employee(int empId, String empName) {
// 		this.empId = empId;
// 		this.empName = empName;
// 	}

// 	@Override
// 	public String toString() {
// 		System.out.println("hello1");
// 		return  empId + " :=> " + empName;
// 	}
	
// 	@Override
// 	public int hashCode() {
// 		System.out.println("hello2");
// 		return empId;
// 	}
	
// 	@Override
// 	public boolean equals(Object obj) {
// 		System.out.println("hello3");
// 		if(obj == null)
// 			return false;
// 		if(obj instanceof Employee) {
// 			Employee e = (Employee) obj;
// 			return empId == e.empId;
// 		}
		
// 		return false;
// 	}
	
	
// }
// public class CollectionDemo1 {

// 	public static void main(String[] args) {
		
// 		HashSet<Employee> a = new HashSet<>();
// 		a.add(new Employee(11, "Ravi"));
// 		a.add(new Employee(21, "Ravi1"));
// 		a.add(new Employee(51, "Ravi2"));
// 		a.add(new Employee(61, "Ravi3"));
// 		a.add(new Employee(14, "Ravi4"));
// 		a.add(new Employee(66, "Ravi5"));
// 		a.add(new Employee(41, "Ravi6"));
// 		a.add(new Employee(11, "Ravi6"));
		
// 		System.out.println(a);
		
// 		for(Employee x : a) {
// 			System.out.println(x);
// 		}
		

// 	}

// }

import java.util.HashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        System.out.println("hello3");
        return Objects.hash(id, name);  
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("hello1");
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 

        Student student = (Student) obj;
        return id == student.id && name.equals(student.name); 
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student(1, "Alice"));
        students.add(new Student(1, "Alice"));  
        students.add(new Student(2, "SKD"));  
        students.add(new Student(5, "Afdsf"));  

        System.out.println("Size of HashSet: " + students.size()); 
    }
}
