package java_hw7_3;

import java.util.Set;

public class Company {  // multiple department
	private Set<Department> department;  // unique by name
	
	public void addDepartment(Department d){
		department.add(d);
	}
	
	public Set<Department> getDepartment(){
		return department;
	}
}
