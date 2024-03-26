package veer.com;

public class Maxmum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,4,5,0};
  int max = arr[0];
  
  for (int i = 1; i < arr.length; i++) {
	if (arr[i]>max) {
		max=arr[i];
		
	}
	
}
  System.out.print(max);
	}


}
