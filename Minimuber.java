package veer.com;

public class Minimuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,4,5,0};
  int min = arr[0];
  
  for (int i = 1; i < arr.length; i++) {
	if (arr[i]<min) {
		min=arr[i];
		
	}
	
}
  System.out.print(min);
	}

}
