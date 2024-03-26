package veer.com;


public class BinarySearch {

	public static int BinarSearch(int arr[] ) {
		int start =0;
		int end = arr.length-1;
		
		int data =6;
		
		while(start<=end) {
			int mid = (start + end)/2;
			
			if (arr[mid]<data) {
				start=mid+1;
				
			}else if (arr[mid]>data) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,4,5,6};
  
  System.out.print(BinarSearch(arr) + " this is postion");
 
  
 
	}

}
