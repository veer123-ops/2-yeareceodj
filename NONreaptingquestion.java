package veer.com;

public class NONreaptingquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="vveer";
   
   for(int i=0;i<string.length();i++) {
	   int count =0;
	   
	   for (int j = 0; j <string.length(); j++) {
		if (string.charAt(i)==string.charAt(j)) {
			
			count++;
			
		}
	}if(count==1) { 
	  // if(count>1){
		System.out.print(string.charAt(i));
	}
   }
	}

}
