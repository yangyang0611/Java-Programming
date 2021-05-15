package classsmate;

public class File extends Document{
	public String pathname;

	public File(){

	  super();

	}


        public void setPathname(String Pname) {

		pathname = Pname;
	}


        public String getPathname() {
		return pathname;
	}


	public String toString() {

		String allText="";
		allText += ("Path: " + getPathname());
                allText += ("\n");
		allText += super.text;
		return allText;
	}
}
