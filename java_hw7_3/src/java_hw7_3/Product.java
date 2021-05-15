package java_hw7_3;

import java.util.Set;

public class Product {
	private Set<Name> name;
	private Set<Cost> cost;
	private Set<Weight> weight;
	private Department department;
	
	public void setDeaprtment(Department d) { // each product is made by exactly one department
		department = d;
	}
	public Department getDepartment() {
		return department;
	}
	
	public void addName(Name n){
		name.add(n);
	}
	public Set<Name> getName() {
		return name;
	}
	
	public void addCost(Cost c){
		cost.add(c);
	}
	public Set<Cost> getCost() {
		return cost;
	}
	
	public void addWeight(Weight w){
		weight.add(w);
	}
	public Set<Weight> getWeight() {
		return weight;
	}
} 
