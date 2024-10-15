package ImportantCodes;

public class SmallestElementArray {

	public static void main(String[] args) {
		
		int[]arr= {1,3,5,9,8,5};
		int smallest=arr[0];
		
		for(int i=0;i>=arr.length;i--) {
			
			if(arr[i]<smallest) {
				
				smallest=arr[i];
			}
		}
		

		System.out.println("Smallest Element in the array is:"+smallest);
	}

}
