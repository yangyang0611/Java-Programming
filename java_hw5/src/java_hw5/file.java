package java_hw5;

public class file extends document{
	private String pathname;
	
	public file() {
		super();
	}
	
	public String toString() {
		return "Path: "+pathname+"\n"+ super.toString(); 
	}
	
	public void setPathname(String newPathname) {
		pathname = newPathname;
	}
	
	public String getPathname() {
		return pathname;
	}
}
