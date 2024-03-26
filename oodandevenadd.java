package veer.com;

public class oodandevenadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,4,5};
  int odd=0;
  int even=0;
 
  for (int i = 0; i < arr.length; i++) {
	if (i%2==0) {
		even=even+arr[i];	
  
	}else {
		odd =odd+arr[i];
	}}
  System.out.println(odd);
  System.out.println(even);
  
	}
	
}
