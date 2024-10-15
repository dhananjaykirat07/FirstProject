package basicprograms;

public class JavaPractice {

	    public static void main(String[] args) {
	        int num=24;
	        boolean isPrime= true;
	        if (num<2){
	            
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