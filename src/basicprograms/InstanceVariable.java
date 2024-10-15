package basicprograms;

public class InstanceVariable {
	
	int i=25;   //Instance Variable.. 
	
	public void instce() {
		
		System.out.println("Just Print U lala re U lala ree...");
	}

	public static void main(String[] args) {
		
		
		InstanceVariable obj1=new InstanceVariable();
	
		System.out.println(obj1.i); 
		//object reference
        obj1.instce();

	}

}
