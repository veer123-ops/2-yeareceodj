package veer.com;

public class LinearSrearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {1,2,3,4,5,6,5,5};
   
   int data =5;
   for(int i=0 ;i<arr.length;i++) {
	   if (arr[i]==data) {
		   System.out.print(i + " this is postion");
		  // break;
		   continue;
		
	}
   }
	} 

}
 