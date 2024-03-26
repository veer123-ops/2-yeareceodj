package veer.com;

import java.util.Stack;

public class BalanceBracket {

	
	public static boolean Balanckert(String srString ) {
		Stack<Character> mpCharacters=new Stack<>();
		for (int i = 0; i < srString.length(); i++) 
		{
			if(srString.charAt(i)=='{') {
				mpCharacters.add('}');
			}
			else if (srString.charAt(i)=='(') {
				mpCharacters.add(')');
			}
			else if(srString.charAt(i)=='[') {
				mpCharacters.add(']');
			}
			else {
				if (mpCharacters.isEmpty()) {
				return false;	
				}
				char cc=mpCharacters.pop();
				if (srString.charAt(i)!=cc) {
					return false;
				}
			}
		}
		if (mpCharacters.isEmpty()) 
			return true;
			else 
				return false;
				
			}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String srString ="{()}{}[}]";
  if (Balanckert(srString)) {
	System.out.print("balnace");
}else {
	System.out.print(" this is not balnce");
  
  }}

}
