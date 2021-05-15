package java_hw7_1;

import java.util.Set;

public class Person{
	protected String name;
	protected String address;
	protected String number;
	private Set<Company> company;
	//protected int time;
	//protected float salary;
	//protected float x; // 倍率，多少時間換多少錢
	//private Set<Project> project;
	
	Person() {}
	
	Person(String n, String addr, String num) {
		this.name = n;
		this.address = addr;
		this.number = num;
	}
	
	public void addCompany(Company c) {
		company.add(c);
	}
	public Set<Company> getCompany () {
		return company;
	}
	/*Person(String n, String addr, String num, int time) {
		this.name = n;
		this.address = addr;
		this.number = num;
		this.time = time;
	}
	
	public void setTime(int t) {
		salary = s;
	}
	public int getTime() {
		return time;
	}
	
	/*public float timeToSalary(int time) {
		return salary = time * x; 
	}*/
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void chargedTime(Project p) {
		
	}
	
	public void earnSalary() {
		
	}
	/*
	public void getProject(Project p) {
		project.add(p);
	}
	
	public Set <Project> getProject(){
		return project;
	}*/
}
