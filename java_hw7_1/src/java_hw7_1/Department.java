package java_hw7_1;

import java.util.Set;

public class Department {
	private String name;
	private Set<Product> manufacture_products;
	private Manager manager;
	
	public Department(String name) {
		this.name=  name;
	}
	
	public void addProduct(Product p) {
		manufacture_products.add(p);
	}
	public Set<Product> getProduct () {
		return manufacture_products;
	}
}
