package java_hw7_1;

import java.util.Set;

public class Manager extends Person{
	private Department department;
	private Set<Project> responsible_projects;
	Manager(String n, String addr, String num) {
		this.name = n;
		this.address = addr;
		this.number = num;
	}
	
	Manager(String n, String addr, String social_security_num, Department d) {
		this.name = n;
		this.address = addr;
		this.number = social_security_num;
		this.department = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return number;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void addProject(Project p) {
		responsible_projects.add(p);
	}
	public Set<Project> getProject () {
		return responsible_projects;
	}
}
