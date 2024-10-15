package ImportantCodes;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int[]arr= {5,3,7,4,2,1};
		int largest =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if (arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println("The Largest Element in an Array : "+ largest);
	}

}
