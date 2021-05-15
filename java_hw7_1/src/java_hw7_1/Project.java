package java_hw7_1;

import java.util.Set;

public class Project {
	private String name;
	private int budget;
	private int securing_resource;
	private Set<Worker> worker;
	private Manager manager;
//	private Set<Salary> salary;
	
	Project(String name, int budget, int securing_resource) {
		this.name = name;
		this.budget = budget;
		this.securing_resource = securing_resource;
	}
	
	public void addWorker(Worker w) {
		worker.add(w);
	}
	public Set<Worker> getWorker () {
		return worker;
	}
	
	/*public void setSalary(Salary s) {
		salary.add(s);
	}
	
	public Set<Salary> getSalary(){
		return salary;
	}*/
}
