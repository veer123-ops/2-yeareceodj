package veer.com;

import java.util.Arrays;

public class Anagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="veer";
  String srString ="veer";
  
  char x [] =string.toCharArray();
  char y [] =srString.toCharArray();
  
  
  Arrays.sort(x);
  Arrays.sort(y);
  
  boolean ist=Arrays.equals(x, y);
  if ( ist==true) {
	  
	  System.out.print(string + " this is anagram");
	
}else {
	System.out.print(string+ " this is not nag");
}
	}

}
