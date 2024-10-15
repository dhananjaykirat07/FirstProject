package basicprograms;

public class Reusability {
	
	int i=25;
	
	public void add() {
		System.out.println(10+15);
	}
	public void sub() {
		System.out.println(20-6);
	}
    public void mul() {
    	System.out.println(9*5);
    }
    public void div() {
    	System.out.println(56/8);
    }
    public void mod() {
    	System.out.println(85%2);
    }
    
    public static void main(String[]args) {
    	
    	Reusability obj=new Reusability();
    	obj.add();
    	obj.sub();
    	obj.mul();
    	obj.div();
    	obj.mod();   
    	System.out.println(obj.i);
    	
    }
	
}
