package java_hw7_1;

import java.util.Set;

public class Company {
	private String address;
	private String phone_num;
	private String name;
	private Set<Person> employees;
	private Set<Department> departments;
	private Product primary_products;
	
	public void addDepartment(Department d) {
		departments.add(d);
	}
	public Set<Department> getDepartment () {
		return departments;
	}
	
	public void hiredEmployee(Person p) {
		employees.add(p);
	}
	public Set<Person> getEmployees () {
		return employees;
	}
	
	public void firedPerson(Person p) {  
		employees.remove(p);
	}
	public Set<Person> leftPerson(){
		return employees;  // after fired person left	
	}
	
	
	
}
