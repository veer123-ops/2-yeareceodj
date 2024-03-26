package veer.com;

public class Reveserwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string =" veer is  good boy";
  String [] string2=string.split("\\s+");
  for (int i = string2.length-1; i>=0; i--) {
	System.out.print(string2[i] + " ");
}
	}

}
