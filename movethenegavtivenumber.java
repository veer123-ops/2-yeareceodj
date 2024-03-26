package veer.com;

import java.util.Arrays;

public class movethenegavtivenumber {

	public static void main(String[] args) {
		// TODO A  uto-generated method stub
  int arr [] = {-10,-20,-1,-2,-3,-45,8,-10,-1,-6,11,-5,12};
  
  for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
  
  System.out.print(Arrays.toString(arr));
	}

}
