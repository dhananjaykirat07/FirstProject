package ImportantCodes;

//A prime number can only be divided evenly (without leaving a remainder) by 1 and the number itself.

public class PrimeNumber {

	public static void main(String[] args) {
		

	
		        int num= 61;
		        boolean isPrime= true;
		        
		        if(num<2) {
		        	
		        }
		        
		        for (int i=2;i<num;i++){
		            if (num%2==0){
		                isPrime =false;
		                break;
		            }
		        }
		        if(isPrime){
		            System.out.println("It is Prime Number.");
		        }
		        else{
		            System.out.println("It is not Prime Number.");
		        }
		    }
		    

		
	}


