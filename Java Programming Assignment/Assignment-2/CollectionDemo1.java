
import java.util.HashSet;

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return  empId + " :=> " + empName;
	}
	
	@Override
	public int hashCode() {
		// System.out.println(empId);
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(obj);
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			return empId == e.empId;
		}
		
		return false;
	}
	
	
}
public class CollectionDemo1 {

	public static void main(String[] args) {
		
		HashSet<Employee> a = new HashSet<>();
		a.add(new Employee(11, "Ravi"));
		a.add(new Employee(21, "Ravi1"));
		a.add(new Employee(51, "Ravi2"));
		a.add(new Employee(61, "Ravi3"));
		a.add(new Employee(14, "Ravi4"));
		a.add(new Employee(66, "Ravi5"));
		a.add(new Employee(41, "Ravi6"));
		a.add(new Employee(11, "Ravi6"));
		a.add(new Employee(11, "Ravi6"));
		
		System.out.println(a);
		
		for(Employee x : a) {
			System.out.println(x.hashCode());
		}
		

	}

}