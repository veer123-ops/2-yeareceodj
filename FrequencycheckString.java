package veer.com;

import java.util.HashMap;
import java.util.Map;

import javax.xml.validation.Validator;

public class FrequencycheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String srString ="veehbhjdbhj";
   
   char []  x = srString.toCharArray();
   
   HashMap<Character, Integer> mpHashMap =new HashMap<>();
   for(char val:  x) {
	   mpHashMap.put(val, mpHashMap.getOrDefault(val, 0)+1);
   }
   for(Map.Entry<Character, Integer> entry:mpHashMap.entrySet()) {
	   System.out.print(entry.getKey()  + "  = " + entry.getValue());
   }
	}

}
