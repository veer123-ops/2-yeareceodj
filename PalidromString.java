package veer.com;

public class PalidromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String string ="veer";
    String string2 ="";
    
    
    for(int i=string.length()-1;i>=0;i--) {
    	string2 =string2+string.charAt(i);
    	
    }if (string2.equals(string)) {
		System.out.print(string  + " this palindrom string");
	}else {
		System.out.print(string + " this is not palidromstrinf");
	}
	}

}
