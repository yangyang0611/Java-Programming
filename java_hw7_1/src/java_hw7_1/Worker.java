package java_hw7_1;

import java.util.Set;

public class Worker extends Person{
	private Set<Project> working_projects;
	
	Worker(String name, String address, String social_security_num) {
		this.name = name;
		this.address = address;
		this.number = social_security_num;
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
	
	public void addProject(Project p) {
		working_projects.add(p);
	}
	public Set<Project> getProject () {
		return working_projects;
	}
}
