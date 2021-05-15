package java_hw7_3;

public class Manager {  // may be / not maybe a department
	private Department department;
	
	public void setDepartment(Department d){  // 這裏可能要動態添加
		department = d;
	}
	public Department getDepartment(){
		return department;
	}
}
