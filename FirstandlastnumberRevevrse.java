package veer.com;

import java.util.Arrays;

public class FirstandlastnumberRevevrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,4,5,6};
   int n=arr.length-1;
   
   int i=0;
   
   for( i=0;i<n/2;i++) {
	   int temp=arr[i];
	   
	   arr[i]=arr[n];
	   arr[n]=temp;
	   i++;
	   n--;
   }
   System.out.print(Arrays.toString(arr));
   
	}

}
