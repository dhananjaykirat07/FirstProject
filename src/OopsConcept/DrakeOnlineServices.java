package OopsConcept;

public class DrakeOnlineServices extends Inheretence {
	
	public void print() {
		
		System.out.println("All types of prints and Xerox.");
	}
   public void scan() {
	   
	   System.out.println("All types of scanning work done here.");
   }
	public static void main(String[] args) {
		
		DrakeOnlineServices dos=new DrakeOnlineServices();
		dos.print();
		dos.scan();
		dos.services();
		dos.tejscreations();	

	}

}
