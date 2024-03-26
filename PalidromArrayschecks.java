package veer.com;

public class PalidromArrayschecks {
	
	public static boolean palidromscheck(int arr []) {
		int i=0;
		int n=arr.length-1;
		while(i<n) {
			if (arr[i]!=arr[n]) {
				return false;
			
		}
		i++;
		n--;
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 int arr [] = {1,2,3,4,3,4,2,1};
		 boolean iste = palidromscheck(arr);
		 
		 if (iste==true) {
			 System.out.print("yes");
			
		}else {
			System.out.print("no");
		}
	}

}
