package veer.com;

public class CheccktheupperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="this is GOOD  BOY THIS IS good boy";
  int mid =string.length()/2;
  
  String lowString=" ";
  String uString = " ";
  for (int i = 0; i < string.length(); i++) {
	if (i<mid) {
		lowString=lowString+Character.toLowerCase(string.charAt(i));
	}else {
		uString=uString+Character.toUpperCase(string.charAt(i));
	}
}
  System.out.println(lowString);
  System.out.println(uString);
	}

}
