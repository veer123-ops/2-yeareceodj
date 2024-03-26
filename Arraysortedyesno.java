package veer.com;



public class Arraysortedyesno {
	
	public static boolean ISArraysesort(int arr []) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,2,3,4,5,0};
  boolean ist=ISArraysesort(arr);
  
  if (ist==true) {
	  System.out.print("yes arrays");
	
}else {
	System.out.print(" is not arrays");
}
  
  
	}

}
