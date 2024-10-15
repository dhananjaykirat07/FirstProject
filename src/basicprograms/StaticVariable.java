package basicprograms;

public class StaticVariable {
	
	static int num =10;
	
	public void stavar() {
		
		System.out.println("It's Static Variable...?");
	}

	public static void main(String[] args) {
		
		System.out.println(num); //Directly 
		
		StaticVariable stva=new StaticVariable();
		
		System.out.println(stva.num); // By object reference
		
		System.out.println(StaticVariable.num); // By class reference
		
		stva.stavar();

	}

}
