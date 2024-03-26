package veer.com;

import java.util.Arrays;

public class Arrayssort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,5,2,3,4,3,0,9,1};
   
   for(int i=0;i<arr.length;i++) {
	   Arrays.sort(arr);
   }
   
   System.out.print(Arrays.toString(arr));
	}

}
