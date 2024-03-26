package veer.com;

import java.util.Arrays;

public class Arraysequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {51,2,4,5};
  int arr1 [] = {1,5,7,8};
  
  boolean ist=Arrays.equals(arr, arr1);
  
  if (ist == true) {
	  
	  System.out.print("yes");
	
}else {
	System.out.print("no");
}
	}

}
