package JustPractice;

/*public class ReverseNumber {

	public static void main(String[] args) {
		
		int num= 123456;						//initialization
		int reversed =0;
		
		//reversed number
		
		while(num!=0) {							//condition
			int digit =num%10;
			reversed=reversed*10+digit;
			num/=10;							//updation
		}
		
		System.out.println("Reversed Number :"+reversed);

	}

}*/

//Fibonnaci Number

/*The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
 * The sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

public class ReverseNumber{//FibonacciNumber
	public static void main(String[]args) {
		
		int n=15;
		int a=0,b=1;
		
		for (int i=1;i<=n;i++) {
			
			System.out.print(a+" ");
			int next =a+b;
			a=b;
			b=next;
		}
	}
}
 

