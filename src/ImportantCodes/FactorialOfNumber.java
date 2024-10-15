package ImportantCodes;
//factorial: This is initialized to 1, as the factorial of any number is calculated by multiplying it with previous numbers.
public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num=7;
		long factorial= 1;
		
		for (int i=1;i<=num;i++) {
			
			factorial *=i;
		}
		
		System.out.println("The Factorial of "+ num +" is "+factorial+".");

	}

}
