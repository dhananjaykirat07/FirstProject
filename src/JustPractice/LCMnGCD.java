package JustPractice;

public class LCMnGCD {
	
	    public static void main(String[] args) {
	        int a = 56; // Hard-coded first number
	        int b = 98; // Hard-coded second number

	        // Calculate GCD using Euclidean algorithm
	        while (b != 0) {
	            int temp = b; // Store second number
	            b = a % b; // Update b to remainder
	            a = temp; // Update a to previous b
	        }

	        System.out.println("GCD is: " + a);
	    }
	}



