package employee;
import java.util.Date;

public class employee {
	private String name;
	private Date hireDate;
	
	public employee() {}
	
	public employee(String theName, Date theDate){
		name = theName;
		hireDate = theDate;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDate() {
		return hireDate;
	}
	
	public boolean equals(employee otherone) {
		if(otherone.getName().equals(this.name) && otherone.getDate().equals(this.hireDate)){ 
			return true; 
		}
		else{ 
			return false;
		}

	}
}
