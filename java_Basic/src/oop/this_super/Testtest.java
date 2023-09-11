package oop.this_super;

public class Testtest {

	public static void main(String[] args) {
		
		int arr[] = {5,23,1,43,100,200,43};
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				
				if(arr[i] > arr[j]) {
					int temp=0;
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
			
		}
		
		
		
	}

}
