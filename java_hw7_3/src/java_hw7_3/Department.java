package java_hw7_3;

import java.util.Set;

public class Department { // maybe be / not have manager
	private Company company;
	private Set<Product> product;  // many product
	private Manager manager;
	
	public void setCompany(Company c) {  // 這裏可能要動態添加
		company = c;
	}
	public Company getCompany() {
		return company;
	}

	public void setManager(Manager m) {  // 這裏可能要動態添加
		manager = m;
	}
	public Manager getManager() {
		return manager;
	}
	
	public void addProduct(Product p) {
		product.add(p);
	}
	public Set<Product> getProduct () {
		return product;
	}
}
