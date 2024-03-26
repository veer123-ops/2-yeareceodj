package veer.com;

public class ArrayssortBullolSort {

	
	public static void Bullosrt(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,5,8,9,3,6,8,1,0,2};
  
  for(int i=0;i<arr.length-1;i++) {
	  for (int j = 0; j < arr.length-1; j++) {
		//if (arr[j]<arr[j+1]) {  acsendorders
			if (arr[j]>arr[j+1]) {// desconsortedd
			int temp=arr[j];
			
			arr[j]=arr[j+1];
			
			arr[j+1]=temp;
			
			
		}
	}
  }
  
  Bullosrt(arr);
	}

}
