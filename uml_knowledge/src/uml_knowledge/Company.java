package uml_knowledge;

import java.util.Set;

public class Company {
	private  Set<Person> employee;
	public void addEmployee(Person p){
		employee.add(p); 
	} 
	public Set<Person> getEmployee(){ 
		return employee; 
	}

}
